import java.util.*;
class GeometricObject {
    private String color;
    private boolean filled;
    private  Date today;

    GeometricObject(String color){}

    GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.today=new Date();
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
//    boolean getFilled(){
//        return filled;
//    }
//    Date getToday(){
//        return today;
//    }
    void setFilled(boolean filled){
        this.filled = filled;
    }
    GeometricObject(){}
}

class  Rectangle extends GeometricObject{
    double width = 2.0;
    double height = 1.0;

    Rectangle(){
    }
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    Rectangle(double width, double height, String color){
        super( color);
        this.width=width;
        this.height=height;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    double getArea(){
        return height*width;
    }
    double getParameter(){
        return 2*(height+width);
    }
    @Override
    public String toString(){
        return "Rectangle: width = " + width + " height = " + height ;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        double a = sc.nextDouble();
        System.out.println("Enter Height : ");
        double b = sc.nextDouble();
        System.out.println("Enter color : ");
        String c = sc.nextLine();
        sc.nextLine();
//        System.out.println("Enter TorF : ");
//        boolean d = sc.nextBoolean();

        Rectangle r1 = new Rectangle(a,b,c);
        System.out.println(r1.getArea());
        System.out.println(r1.getParameter());
        System.out.println(r1.getColor());
        System.out.println(r1.isFilled());
    }

}