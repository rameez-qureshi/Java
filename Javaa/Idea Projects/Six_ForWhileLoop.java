public class Six_ForWhileLoop {
    public static void main(String[] args){
        // LOOP

        // FOR LOOP         // 1 to 10
        for(int i = 1; i <= 10; i = i+1) {    // initial value , condition , loop statement
            System.out.println("for loop 1 to 10: " + i);
        }

        // 10 to 1
        for(int i = 10; i >= 1; i = i-1) {    // initial value , condition , loop statement
            System.out.println("for loop 10 to 1: " + i);
        }

        // WHILE LOOP
        int j = 1;
        while (j <= 10){
            System.out.println("while loop 1 to 10: " + j);
            j = j + 1;
        }

        // DO WHILE LOOP
        int k = 0;
        do {
            System.out.println("do while loop 0 to 10: " + k);
            k++;
        } while(k<=10);

        // BREAK & CONTINUE STATEMENT

        int pen = 1;
        while(true){                      // this statement can work infinite times
            System.out.println("pen: " + pen);
            pen = pen + 1;
            //pen++;
            if(pen > 5){
                break;                    // break statement use to stop loop
            }
        }

        int pin = 1;
        while(true){
            if(pin == 3){            // this mean when 3 number turn program not print 3
                pin = pin + 1;   // this use when 3 turn we change 3 to 4
                continue;        // continue is use to continue loop and not stop loop during 3 number turn
            }
            System.out.println("pin: " + pin);
            pin = pin + 1;
            if(pin > 5){
                break;         // break use to stop loop when pin = 6
            }
        }

    }
}
