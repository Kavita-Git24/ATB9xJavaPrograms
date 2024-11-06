package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_30102024_left_triangle {
    public static void main(String[] args) {

        /*
        *****
        ****
        ***
        **
        *
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int size=sc.nextInt();
        for(int i=size;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
