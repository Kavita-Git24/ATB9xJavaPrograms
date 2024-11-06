package Nov_Task.Nov_Task;

import java.util.Scanner;

public class task_06112024_Constructor_P2 {
    public static void main(String[] args) {
        employee1 e1=new employee1();
        e1.display_employee_detail();

        employee1 e2=new employee1("Sahil");
        e2.display_employee_detail();

        employee1 e3=new employee1("Nisha","Marketing");
        e3.display_employee_detail();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name-->");
        String name=sc.next();
        System.out.println("Enter employee department-->");
        String dept=sc.next();
        System.out.println("Enter employee age-->");
        int age=sc.nextInt();
        employee1 e4=new employee1(name,dept,age);
        e4.display_employee_detail();
    }
}

class employee1{
    String name;
    String dept;
    int age;

    employee1()
    {
        name="Sonia";
        dept="Account";
        age=28;
    }

    employee1(String emp_name)
    {
        this.name=emp_name;
        dept="IT";
        age=25;
    }

    employee1(String emp_name,String emp_dept)
    {
        this.name=emp_name;
        this.dept=emp_dept;
        age=27;
    }

    employee1(String emp_name,String emp_dept,int emp_age)
    {
        this.name=emp_name;
        this.dept=emp_dept;
        this.age=emp_age;
    }
    void display_employee_detail()
    {
        System.out.println("Name->" +this.name +" Department->" + this.dept + " Age->" +this.age);
    }
}
