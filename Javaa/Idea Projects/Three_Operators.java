public class Three_Operators {
    public static void main(String[] args) {

        // OPERATORS

        // 1 -- Arithmetic Operators
        int a = 30;
        int b = 40;
        int sum = a + b;

        int c = 30;
        int d = 40;
        int diff = a - b;

        int e = 30;
        int f = 40;
        int mul = a * b;

        int g = 30;
        int h = 40;
        int div = a / b;

        int i = 30;
        int j = 40;
        int modulo = a % b;      // ‘%’ Modulo - Remainder of a/b

        // Uniary Operators

        int numbs = 1;
        System.out.println(numbs++);   // increments
        System.out.println(numbs);

        System.out.println(++numbs);   // increments
        System.out.println(numbs);

        System.out.println(numbs--);   // decrements
        System.out.println(numbs);

        System.out.println(--numbs);   // decrements
        System.out.println(numbs);

         // 2 -- Comparison Operators

        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // 2 -- Logical Operators   ( and , or , not )

        int aa = 25;
        int bb = 50;
        boolean cc = false;

        if( aa > 20 && aa < 30 )            //  AND if both condition true so print True otherwise False
            System.out.println("Jiyo");

        if( aa > 30 || aa < 30 )            //  OR if any condition true so print True otherwise False
            System.out.println("Jiyo");

        if(!cc)            //  NOT reverse answer
            System.out.println("T or F");


    }
}
