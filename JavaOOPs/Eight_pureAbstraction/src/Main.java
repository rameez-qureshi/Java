
//   PURE ABSTRACTION AND INTERFACES

//   In interfaces we use pure abstraction
//   pure abstraction can hide useless info and user can see useful info by using interfaces.
//   In INTERFACES properties are public (accessible for everyone),
//                                static (same for every derived class)
//                                and final (fix value for every derived class) by default.
//   In INTERFACES methods are public and abstract by default.

// In previous "seven_abstraction" folder code is not pure abstract
// bcz we use non-abstract functions in parent class ( eat function )

interface Animal{
    int eyes = 2;
    void walk();
    // Animal();     // giving error bcz we cant made constractor in interface.
    //void eat(){};   // giving error bcz we cant made non abstract method in interface.
}
interface Herbivore{    // herbivore are animals only eat plants

}
class Horse implements Animal,Herbivore{// implements work same as extends but extends cant make 2 parent class in 1 derived
    public void walk(){

        System.out.println("walks on 4leg");
    }
}
public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        System.out.println("Hello world!");
    }
}