import java.util.Arrays;        // import bcz using arrays in code

public class Two_ListArrays {
    public static void main(String[] args) {
        int agee = 90;
        int physics = 76;
        int chem = 35;
        int math = 98;

        // ARRAYS

        int[] marks = new int[3];
        System.out.println(marks[2]);     // print before value defined // value not defne output = zero
        marks[0]= 76;
        marks[1]= 35;
        marks[2]= 98;

        System.out.println(marks);        // wrong method  ( output = [I@6acbcfc0 )
        System.out.println(marks[0]);

        // Arrays Properties / Functions
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);   // after sort print ans= 35

        // SECOND TYPE ARRAYS

        int[] numbers = {70, 80, 90};     // 1d arrays
        int[][] finalnumbers = {{40, 50, 60}, {70, 80, 90}};     // 2d arrays - 2 students sub marks
        System.out.println(numbers[1]);
        System.out.println(finalnumbers[0][0]);
        System.out.println(finalnumbers[0][2]);
        System.out.println(finalnumbers[1][1]);

        // CASTINGS
        float price = 100.00F;         // Implicit casting
        int gst = 18;
        float finalPrice = price + gst;
        System.out.println("finalPrice: " + finalPrice);

        int pr = 100;
        float gsst = 18.00F;
        int fP = pr + (int)gsst;       // Explicit casting
        System.out.println("fp: " + fP);

        // CONSTANT

        int age = 18;
        System.out.println(age);
        age = 19;
        age = 20;
        System.out.println(age);      // change age anytime

        final float PI = 3.142F;         // final is a constant - this value cant be change
        System.out.println(PI);
        // PI = 3.567F;                     //giving error
        // System.out.println(PI);



    }
}
