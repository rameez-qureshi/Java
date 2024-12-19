
/* write a java program to take input numbers from users and if user enter number below 0
   then program end and print "The End" */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter Number: ");
            number = sc.nextInt();
            System.out.println("your number is " + number);


        }while (number >= 0);
        System.out.println("THE END");
    }
}