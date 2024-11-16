package Nov.ex_14112024_Static_Enum;

public class Lab163_Static{
    public static void main(String[] args) {
        System.out.println(Student.student_name);
        Student s1=new Student();
        Student s2=new Student();

        Student.student_name="XYZ";
        System.out.println(s1.student_name);
        System.out.println(s2.student_name);
    }
}

class Student{
    static String student_name="ABC";
    int age;
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code you want to do when Object is created");
        System.out.println("Read a MYSQL db()");
    }

    static
    {
        System.out.println("SIB");
        System.out.println("Loaded Once,When class is loaded.");
        System.out.println("Read the excel");
    }
}