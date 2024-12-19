
// TYPE-2 -- Multi level inheritance ( base class to derived class and again derived class)

class Shapes{
    public void area(){
        System.out.println("displays error");
    }
}
class Triangles extends Shapes{
    public void area(int length, int height){

        System.out.println(1/2*length*height);
    }
}
class EquilateralTriangles extends Triangles{
    public void area(int length, int height){

        System.out.println(1/2*length*height);
    }
}
public class inheritanceType2 {
    public static void main(String[] args) {
    }
}
