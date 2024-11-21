package Nov.ex_21112024_List_Set_Collection_Framework;

public class Student {

    private String name;
    private String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public void printDetails()
    {
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.rollno);
    }
}
