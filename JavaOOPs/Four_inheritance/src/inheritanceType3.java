
// TYPE-3 -- Hierarchial inheritance ( base class and its two derived class)

class Shapess{
    public void area(){
        System.out.println("displays error");
    }
}
class Triangel extends Shapess{
    public void area(int length, int height){

        System.out.println(1/2*length*height);
    }
}
class Circle extends Shapess{
    public void area(int radius){

        System.out.println((3.14)*radius*radius);
    }
}

public class inheritanceType3 {
    public static void main(String[] args) {
    }
}
