package Nov.ex_22112024_Map_Collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab222_Map_P5 {
    public static void main(String[] args) {
        //Map - K,V, null values allows

        //Hashtable - Synchronised, Slow and Legacy Class
        //T1, T2 - they will use one by one.

        Hashtable<Integer,String> ht1=new Hashtable<>();
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");
//        ht1.put(4,null); //NullPointerException
//        ht1.put(null,"Four");   //NullPointerException
        System.out.println(ht1);

        Map<Integer,String> ht2=new HashMap<>();
        ht2.put(1,"One");
        ht2.put(2,"Two");
        ht2.put(3,"Three");
        ht2.put(4,null);
        ht2.put(null,"Four");
        System.out.println(ht2);

        Enumeration<Integer> e= ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
