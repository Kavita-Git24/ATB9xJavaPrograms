package Nov_Task.Nov_Task;

import java.util.Scanner;

public class task_06112024_Constructor_P1 {
    public static void main(String[] args) {
        employee e1=new employee();
        e1.display_employee_detail();

        employee e2=new employee("Sahil");
        e2.display_employee_detail();

        employee e3=new employee("Nisha","Marketing");
        e3.display_employee_detail();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name-->");
        String name=sc.next();
        System.out.println("Enter employee department-->");
        String dept=sc.next();
        System.out.println("Enter employee age-->");
        int age=sc.nextInt();
        employee e4=new employee(name,dept,age);
        e4.display_employee_detail();
    }
}

class employee{
    String name;
    String dept;
    int age;

    employee()
    {
        name="Sonia";
        dept="Account";
        age=28;
    }

    employee(String emp_name)
    {
        name=emp_name;
        dept="IT";
        age=25;
    }

    employee(String emp_name,String emp_dept)
    {
        name=emp_name;
        dept=emp_dept;
        age=27;
    }

    employee(String emp_name,String emp_dept,int emp_age)
    {
        name=emp_name;
        dept=emp_dept;
        age=emp_age;
    }
    void display_employee_detail()
    {
        System.out.println("Name->" +name +" Department->" + dept + " Age->" +age);
    }
}
