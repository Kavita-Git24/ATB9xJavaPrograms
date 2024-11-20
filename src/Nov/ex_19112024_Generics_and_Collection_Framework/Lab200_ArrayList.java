package Nov.ex_19112024_Generics_and_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_ArrayList {
    public static void main(String[] args) {

        List studentlist=new ArrayList();
        studentlist.add("Komal");
        studentlist.add("Sohna");
        studentlist.add(5);
        studentlist.add(5);
        studentlist.add(true);
        studentlist.add(10);
        studentlist.add(null);
        System.out.println(studentlist);
        System.out.println(studentlist.size());
        System.out.println(studentlist.isEmpty());
        System.out.println(studentlist.lastIndexOf(5));
        System.out.println(studentlist.contains("komal"));
        System.out.println(studentlist.contains("Sohna"));
        System.out.println(studentlist.indexOf(5));
    }

}
