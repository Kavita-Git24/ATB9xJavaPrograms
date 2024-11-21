package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab215_Vector {
    public static void main(String[] args) {
        Vector <String> v=new Vector<>();
        v.add("apple");
        v.add("orange");

        for(String o:v)
            System.out.println(o);

        //Iterator - cannot be used for legacy class
        //Enumeration

        Enumeration<String> enumeration=v.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
