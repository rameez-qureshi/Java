class Pen{
    String color;
    String type; // inkpen ballpen gelpen

    public void write(){                       // // fuction define in class called methods

        System.out.println("Write Something");

    }
    void penInfo(String c,String type){
        color = c;
        this.type = type;
    }
    void display(){

        System.out.println(color+" "+type);

    }
//    public void printcolor(){                   // this.property of any object
//        System.out.println(this.color);    // 'THIS' it is use to call any class property
//    }
}

public class Main {
    public static void main(String[] args){
        Pen pen1 = new Pen();          // create object
//        pen1.color = "blue";           // object property 1
//        pen1.type = "inkpen";             // object property 2

//        Pen pen2 = new Pen();          // create object
//        pen2.color = "black";           // object property 1
//        pen2.type = "ballpen";             // object property 2

        pen1.penInfo("pink","rgrfg");
        pen1.display();
//        pen1.printcolor();           // call write function
//        pen2.printcolor();
    }
}