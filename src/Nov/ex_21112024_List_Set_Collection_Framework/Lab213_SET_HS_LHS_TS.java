package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public interface Lab213_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set hs=new HashSet();
        //Hashing mechanism to store element
        //no order no duplicate
        hs.add("apple");
        hs.add("Orange");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.size());


        Set lhs=new LinkedHashSet();
        //Hashing mechanism to store element
        // order will be maintain  no duplicate
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        lhs.add(null);

        Set ts=new TreeSet();
       // Set<String> ts=new TreeSet();
        //Hashing mechanism to store element
        // sorting will be done automatically  no duplicate
        ts.add("apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
//        ts.add(null); NullPointerException
//       ts.add(123);ClassCastException

        System.out.println(ts);
        //System.out.println(ts.size());
        for(Object o:ts)
            System.out.println(o);

    }
}
