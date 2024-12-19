package ten_fileHandling;

import java.io.FileWriter;          // Import the FileWriter class
import java.io.IOException;         // Import the IOException class to handle errors

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("ten_fileHandling\\mehran.txt");
            myWriter.write("Hemloooooo" + "\nthis is in a next line");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
