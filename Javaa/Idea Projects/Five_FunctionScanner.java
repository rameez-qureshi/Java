
import java.util.Scanner;       // import for taking input

public class Five_FunctionScanner {
    public static void main(String[] args) {

        // MATH Functions

        // 5, 6
        System.out.println(Math.min(5, 6));
        System.out.println(Math.max(5, 6));
        System.out.println(Math.random());
        System.out.println((int)Math.random());        // Explicit Casting
        System.out.println((int)(Math.random()*100));

        // INPUT METHODS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here: ");
        int n = sc.nextInt();             // for number
//        float a = sc.nextFloat();       // for numbers in point
//        String name = sc.next();        // for alphabetic word
//        String line = sc.nextLine();    // for alphabetic line

        System.out.println("your number is: " + n);


    }
}
