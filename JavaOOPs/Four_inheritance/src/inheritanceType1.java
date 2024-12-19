
// TYPE - 1 -- Single level inheritance ( base class to derived class )

class Shapee{
    public void area(){
        System.out.println("displays error");
    }
}
class Trianglee extends Shapee{
    int length;
    int height;
    public void area(int length, int height){
        this.height = height;
        this.length = length;
    }
    public void display(){
        System.out.println(length+height);
        System.out.println( 0.5 * length * height);
    }
}

public class inheritanceType1 {
    public static void main(String[] args) {
        Trianglee t1 = new Trianglee();
        t1.area(24,56);
        t1.display();

    }
}
