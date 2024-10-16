package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_16102024_t1_scanner {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Age");
        int age= sc.nextInt();
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("Age:" +age);
        System.out.println("Salary: " +salary);
    }
}
