import java.util.ArrayList;
import java.util.Collections;


public class nine_ARRAYlist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0);            // 0 is the index to print
        System.out.println(element);
        System.out.println(list.get(2));


        //add element in between
        list.add(1,2);           // 1 is the index and 2 is the element to be added
        System.out.println(list);


        //set element  -- replace element
        list.set(0,0);                         // 0 is the index and 0 is the new element to replace
        System.out.println(list);


        //delete elements
        list.remove(0);                      // 0 is the index that delete
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);
        System.out.println(list.size());


        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");   // by use get we print element of list
        }
        System.out.println();


        //Sorting the list
        list.add(1);                 // by default this add to index zero
        Collections.sort(list);      // collection is a builtin package in java we import this to use it
        System.out.println(list);
    }
}

