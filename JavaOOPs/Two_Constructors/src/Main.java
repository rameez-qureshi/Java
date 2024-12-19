
// THREE TYPE OF CONSTRUCTORS

class Student{          // TYPE-1    NON-PARAMETERIZED CONSTRUCTOR
    String name;
    int age;
    Student(){   // this is default constructor. it can print when object create if ( ) are empty if you assign in ( )
        System.out.println("DEFAULT CONSTRUCTOR");       // so we can use other function to print
    }
    public void studentInfo(){
        System.out.println("hello boi");
        System.out.println(name);
        System.out.println(age);
    }
}
class Pen{          // TYPE-2    PARAMETERIZED CONSTRUCTOR
    String color;
    String type; // inkpen ballpen gelpen
    Pen(String color, String type){
        this.color = color;
        this.type = type;
    }
    public void penInfo(){
        System.out.println(color);
        System.out.println(type);
    }
}

class Man{          // TYPE-3    COPY CONSTRUCTOR
    String name;
    int age;
    public void manInfo(){
        System.out.println("hello copy");
        System.out.println(name);
        System.out.println(age);
    }
    Man(Man m2){
        this.name = m2.name;
        this.age = m2.age;
    }
    Man(){}   // it is imp to define default constructor in copy constructor
}

public class Main {
    public static void main(String[] args) {       // TYPE-1    NON-PARAMETERIZED CONSTRUCTOR
        Student s1 = new Student();
        s1.name = "shan";
        s1.age = 20 ;
        s1.studentInfo();

        System.out.println();

        Pen p1 = new Pen("Black","Inkpen");        // TYPE-2    PARAMETERIZED CONSTRUCTOR
        p1.penInfo();

        System.out.println();

        Man m1 = new Man();                // TYPE-3    COPY CONSTRUCTOR
        m1.name = "humaiz";
        m1.age = 40 ;
        m1.manInfo();

        Man m2 = new Man(m1);
        m2.manInfo();

    }
}