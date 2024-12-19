import java.util.Scanner;

public class four__ConditionalStatements {
    public static void main(String[] args) {

        // Conditional Statements            IF -- ELSE

        // FIRST
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        // SECOND
        int age = 30;
        if(age >= 18)
            System.out.println("This is an adult");
        else
            System.out.println("This is not an adult");

        //Third
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cash amount: ");
        int cash = sc.nextInt();                    // pen = 10 , book = 40
        if(cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("Get more cash");
        }
        else if(cash >= 10 && cash < 50) {                 // (AND statement) run when both condition are true
            System.out.println("Can get one thing.....");
        }
        else{
            System.out.println("Can get both");
        }


        // Conditional Statements            SWITCH

        int day = 2;      // day = 1 so case 1 print
        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;                               // ( BREAK STATEMENT )   it break statement after print
            case 2 :
                System.out.println("Tuesday");
                break;                               // if not use break statement so after
            case 3 :
                System.out.println("Wednesday");
                break;                               // true condition all condition print
            case 4 :
                System.out.println("Thursday");
                break;               // break statement use to exit from block and not execute after statements
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :                              // last case is default
                System.out.println("Sunday");
        }
    }
}
