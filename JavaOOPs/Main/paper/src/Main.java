import java.util.Date;

class Hello{
    boolean x;
    String him = "kjkj";
}
public class Main{
    public static void main(String[] args) {
        Hello h1 = new Hello();
        System.out.println(h1.him);
        System.out.println();

        Date date = new Date();
        System.out.println(date.toString());
    }
}