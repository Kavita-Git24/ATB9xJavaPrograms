package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_22102021_reversenumber {
    public static void main(String[] args) {
      // Reverse the number using for loop. (In - 12345, Out - 54321)

        int number,remainder,reverse;
        remainder=0;
        reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        number =sc.nextInt();

        for(int i = 0; number !=0; i++)
        {
            remainder= number %10;
            reverse=reverse*10+remainder;
            number = number /10;

        }
        System.out.println("Reverse String-->"+reverse);
    }

    //12345/10
}
