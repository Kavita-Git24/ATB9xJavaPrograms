package Nov.Lists_Collection_Framework;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Mohan");
        v.add("Viraj");
        v.add("Soham");
        v.add("Yuvraj");
        System.out.println(v);
        v.remove("Soham");
        System.out.println(v);
        System.out.println(v.contains("Soham"));
    }
}
