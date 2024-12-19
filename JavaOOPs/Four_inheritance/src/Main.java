
// INHERITANCE

// There are four type in INHERITANCE
// 1 -- Single level inheritane ( base class to derived class )
// 2 -- Multi level inheritane ( base class to derived class and again derived class )
// 3 -- Hierarchial inheritane ( base class and its two derived class )
// 4 -- Hybrid inheritane ( base class and its two derived class and aslo
                                 // one derived has its own derived class )

class Shape{
    String color;
}

class Triangle extends Shape{

}

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}