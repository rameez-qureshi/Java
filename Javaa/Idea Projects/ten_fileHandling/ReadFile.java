package ten_fileHandling;

import java.io.File;                        // Import the File class
import java.io.FileNotFoundException;       // Import this class to handle errors
import java.util.Scanner;                   // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("ten_fileHandling\\mehran.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {               // while for read everyline
                System.out.println(sc.nextLine());
            }
            // System.out.println(sc.nextLine());    // for read only line
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}