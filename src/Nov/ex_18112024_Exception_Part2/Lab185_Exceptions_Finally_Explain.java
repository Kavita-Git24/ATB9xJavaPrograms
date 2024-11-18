package Nov.ex_18112024_Exception_Part2;

import java.util.Scanner;

public class Lab185_Exceptions_Finally_Explain {
    public static void main(String[] args) {
        Scanner sc=null;
        sc=new Scanner(System.in);
        int v= sc.nextInt();
        try {
            int a=v/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Closing sc  ");
        }

    }
}
