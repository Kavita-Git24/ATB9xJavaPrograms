package Nov.Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab204_Nested_ArrayList {
    public static void main(String[] args) {
        List fruits1=new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Kiwi");
        fruits1.add("Apple");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("Papaya");
        fruits2.add("Mango");
        fruits2.add("Blueberry");
        System.out.println(fruits2);

        List vegetables=new ArrayList();
        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("Chilly");
        System.out.println(vegetables);

        //nested arraylist
        List all_fruits=new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        System.out.println(all_fruits);
    }
}
