
import java.io.File;
import java.io.IOException;


public class FileCreate {
    public static void main (String[] args){
        try {
            File myfile = new File ("ten_fileHandling\\mehran.txt");
            myfile.createNewFile();
            System.out.println("File Created");
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }
    }
}
