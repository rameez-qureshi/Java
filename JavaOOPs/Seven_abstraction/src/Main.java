
// ABSTRACTION
// abstractions means user see imp data and we hide useless data from users

// There are 2 type to use ABSTRACTION
// 1 - we use abstraction keyword, classes, functions and properties.
// 2 - we use interfaces

abstract class Animal {     // this is parent class we cant made animal object ( we made horse or chicken obj )
                            // so we made this class abstract
    abstract void walk();   // we also use abstract in functions and remove " { } ".
    // and we also not use walk function in animal class so we made this function abstract

    // if we made animal object and call function then error bcz we made both abstract
    // we made both abstract bcz nobody use animal class for object

    public void eat() {                  // this function is non abstract we use this in every derived class
        System.out.println("Animal eat everything");
    }
    Animal(){
        System.out.println("We talk about Animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 leg");
    }
    Horse(){
        System.out.println("we create a horse object");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 leg");
    }
}
public class Main {
    public static void main(String[] args) {
        Horse tikka = new Horse();  // when we create horse object then first call parent class constructor
        tikka.walk();               // and then call horse class constructor known as constructor chaining.
        tikka.eat();
    }
}