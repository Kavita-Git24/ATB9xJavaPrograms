package Nov.ex_19112024_Generics_Why_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab199_ArrayList {
    public static void main(String[] args) {
//        Collection studenlist1=new ArrayList();
//        List studentlist2=new ArrayList();
        ArrayList studentlist=new ArrayList();
        studentlist.add("Komal");
        studentlist.add("Sohna");
        studentlist.add(true);
        studentlist.add(10);
        studentlist.add(null);
        System.out.println(studentlist);
    }

}
