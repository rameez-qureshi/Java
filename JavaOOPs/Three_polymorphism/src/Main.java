
// There are two type of polymorphism
// 1 -- Compile time polymorphism
// 2 -- Run time polymorphism

class Student{         // TYPE--1 -- Compile time polymorphism
    String name;
    int age;

    public void printinfo(String name) {

        System.out.println(name);
    }
    public void printinfo(int age) {

        System.out.println(age);
    }
    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }                                           // same method with diff parameter in 1 class called overloaded
}                                               // functions also known as polymorphism
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bilal" ;
        s1.age = 30 ;

        s1.printinfo(s1.name,s1.age);
    }
}