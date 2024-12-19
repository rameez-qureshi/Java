import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rannum = (int)(Math.random()*100);
        int usernum = 0;

        do{
            System.out.println("Guess Number: ");
            usernum = sc.nextInt();

            if (usernum == rannum) {
                System.out.println("YOU GUESS RIGHT...");
                break;                                          // use to stop loop when num is right
            }
            else if (usernum > rannum) {
                System.out.println("your number is large");
            }
            else {
                System.out.println("your number is small");
            }

        }while(usernum >= 0);

        System.out.println("Number was " + rannum);

    }
}
