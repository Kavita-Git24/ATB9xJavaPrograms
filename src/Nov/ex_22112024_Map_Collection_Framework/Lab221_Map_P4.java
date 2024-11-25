package Nov.ex_22112024_Map_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab221_Map_P4 {
    public static void main(String[] args) {
        Map<String,Object> student1=new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone","9851212123");
        student1.put("address","Bangalore");
        System.out.println(student1);

        Map<String,Object> student2=new HashMap();
        student2.put("name","amit");
        student2.put("phone","9851212125");
        student2.put("address","Assam");
        System.out.println(student2);

        List students=new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        for(Map.Entry<String,Object> items:student1.entrySet()){
            System.out.println(items.getKey()+" ->" +items.getValue());
        }
    }
}
