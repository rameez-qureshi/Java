
// 4 -- Hybrid inheritance ( base class and its two derived class and aslo
                                 // one derived has its own derived class )

class Shapeee{
    public void area(){
        System.out.println("displays error");
    }
}
class Triangil extends Shapeee{                     // derived class of shape
    public void area(int length, int height){
        System.out.println(0.5*length*height);
    }
}
class Circless extends Shapeee{                       // derived class of shape
    public void area(int radius){
        System.out.println((3.14)*radius*radius);
    }
}

class EquilateralTriangil extends Triangil{        // derived class of triangle
    public void area(int length, int height){
        System.out.println(0.5*length*height);
    }
}

public class inheritanceType4 {
    public static void main(String[] args) {
    }
}
