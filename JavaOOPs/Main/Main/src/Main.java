import java.util.*;
class GeometricObject {
    private String color;
    private boolean filled;
    private  Date today;

    GeometricObject(String color){
    }

    String getColor(){

        return color;
    }


//    Date getToday(){
//
//        return today;
//    }
    void setColor(String color){

        this.color = color;
    }

    public boolean getFilled()
    {
        if (isFilled()) {
            this.filled = true;
            return this.filled;
        } else{
            this.filled = false;
            return this.filled;
        }
    }

    public boolean isFilled() {
        if(getColor() != null) {
            return true;
        } else{
            return false;
        }
    }
    GeometricObject(){}
}

class  Rectangle extends GeometricObject{
    double width;
    double height;

    Rectangle(){
        this.height = 1.0;
        this.width = 2.0;
    }
    Rectangle(double width, double height, String color){
        super( color);
        this.width=width;
        this.height=height;
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
        sc.nextLine();
        System.out.println("Enter color : ");
        String c = sc.nextLine();

        Rectangle r1 = new Rectangle(a,b,c);
        System.out.println(r1.getArea());
        System.out.println(r1.getParameter());
        System.out.println(r1.getColor());
        System.out.println(r1.isFilled());

//        if(r1.getColor() == null) {
//            System.out.println("True");
//        } else{
//            System.out.println("False");;
//        }
    }

}