public class Seven_Exceptionerror {
    public static void main(String[] args) {

        //  TRY-CATCH in EXCEPTION HANDLING
        int[] marks = {98, 97, 95};          // arraylist
        System.out.println(marks[2]);

        try {                                // TRY can check if error in this line
            System.out.println(marks[4]);

        } catch (ArrayIndexOutOfBoundsException exception) {  //this CATCH can execute if this type of exception occur
            System.out.println("An exception for caught while accessing an index the 'marks' array");
        } catch (Exception exception) {    //this CATCH can execute if any type of exception occur
            System.out.println("An exception for caught while accessing an index the 'marks' array");
        }

        System.out.println("We tried to print marks & an exception must have occurred with index >=3");

    }
}