
// STATIC KEYWORD
// static means accessible for everyone and common for class

// static keyword can directly access by classname.keyword and without make object

class Student{
    String name;
    static String school;

    public static void changeSchool(){    // static variable can change 1 time for everyone
        school = "newschool" ;
    }
}
public class Main {
    public static void main(String[] args) {

        //Student.school = "ABC";
        // student.school();

        Student student1 = new Student();
        student1.name = "TonyKakkar";
        System.out.println(student1.school);

    }
}

// if we want to save memory and one information is common for everyone
// so we use static keyword to save memory