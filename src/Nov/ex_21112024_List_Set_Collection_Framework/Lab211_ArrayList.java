package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab211_ArrayList {
    public static void main(String[] args) {
        Student s1=new Student("Komal","21");
        Student s2=new Student("Kiran","2");
        Student s3=new Student("Nisha","22");

        List<Student> studentlist=new ArrayList();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(studentlist);
    }


}
