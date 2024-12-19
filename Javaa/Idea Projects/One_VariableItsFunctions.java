public class One_VariableItsFunctions {
    public static void main(String[] args) {


        System.out.println("Hello and welcome!");

        // variable

        String name = "Abbu" ;
        int age = 99 ;
        String friend = "bro" ;
        String neighbour = "hello" ;
        String neighbour1 = neighbour ;
        System.out.println(name);
        System.out.println(neighbour);
        System.out.println(neighbour1);

        // VARIABLE TYPES
        // There are two variable types 1-(Primitive type) 2-(Non-primitive type/Reference)

        // 1 - Primitive Types

        //byte - 1       [ -128 to 127 ]
        //short - 2
        //int - 4        1, 2, 3
        //long - 8
        //float - 4      3.142
        //double - 8
        //character(char) - 2     @, $, &
        //boolean - 1    true/false

        byte aage = 12 ;
        int phone = 1234567890 ;
        long phone2 = 12345678900L ;
        float pi = 3.142F ;
        char letter = '@' ;
        boolean isAdult = false ;

        // 2 - NON-Primitive Types / Reference

        //STRING
        String naam = "Akku";
        System.out.println(naam);
        //Length string function
        System.out.println(naam.length());
        //charAt string function
        System.out.println(naam.charAt(3));

        //replace string function
        String naamreplace = naam.replace("k","b");
        System.out.println(naamreplace);

        // if you write new string that mean its a new string
        String laptop = new String ("lenovo");
        System.out.println(laptop);

        //Concatenate String function
        String pc = "hp" ;
        String pc1 = "dell" ;
        String pc2 = pc + pc1 ;
        System.out.println( pc2 );
        System.out.println( pc + " and " + pc1 );

        //substring String function
        String mix = "bike and car";
        System.out.println(mix.substring(0,4));
        System.out.println(mix.substring(9,12));

    }
}