public class eight_OwnMethodsFunctions {

    public static void printJava(){                 // create own method

        System.out.println("Hello Java");
    }
    public static void printName(String name){      // second method

        System.out.println( name + " " + "hjbnbnbn");
    }

    //A METHOD to calculate sum of 2 numbers - a & b
    public static void sum(int a, int b) {          // Third method
        int sum = a + b;
        System.out.println(sum);
        // System.out.println( a + b );
    }

        public static void main(String[] args) {

    printJava();
    printJava();

    printName("akku");
    printName("abbu");

    sum(20,30);
    sum(25,25);
    }
}
