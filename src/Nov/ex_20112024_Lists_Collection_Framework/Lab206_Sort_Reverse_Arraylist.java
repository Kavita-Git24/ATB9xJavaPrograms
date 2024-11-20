package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Lab206_Sort_Reverse_Arraylist {
    public static void main(String[] args) {
        ArrayList marks=new ArrayList();
        marks.add(50);
        marks.add(23);
        marks.add(90);
        marks.add(40);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println("Sorted Array");
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Reversed Array");
        System.out.println(marks);
    }
}
