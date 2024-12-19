
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class ALLinONE {
    public static void main(String[] args) {

        try{
            File myfile = new File("ten_fileHandling\\hello.txt");      // Creating File
            myfile.createNewFile();
            System.out.println("File Created");

            FileWriter myfilee = new FileWriter("ten_fileHandling\\hello.txt");       // Writing in File
            myfilee.write("woh roh bhi meri"+"\nwoh jism bhi mera"+"\njitna mera nhi"+"\nutna huwa tera");
            myfilee.close();
            System.out.println("Writing Done");
            System.out.println();

            Scanner readfile = new Scanner(myfile);          // Reading File
            while(readfile.hasNextLine()){
                System.out.println(readfile.nextLine());
            }
            System.out.println();
            System.out.println("Reading Done");
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
}