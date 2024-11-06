package Oct.ex_30102024_Arrays;

import java.util.Scanner;

public class Lab138_Right_Triangle_2D {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number->");
        int size= sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
