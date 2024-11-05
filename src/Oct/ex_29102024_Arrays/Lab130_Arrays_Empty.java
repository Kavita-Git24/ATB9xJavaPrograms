package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class Lab130_Arrays_Empty {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter number " +(i+1));
            array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
}
