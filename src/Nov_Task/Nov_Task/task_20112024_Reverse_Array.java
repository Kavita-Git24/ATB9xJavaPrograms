package Nov_Task.Nov_Task;

import java.util.Scanner;

public class task_20112024_Reverse_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size=sc.nextInt();

        int[] ele=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter elements in Array[" +i +"]");
            ele[i]= sc.nextInt() ;
        }
        System.out.println("------Reversed Array------");
        for(int j=ele.length-1;j>=0;j--)
        {
            System.out.println(ele[j]);
        }


    }
}
