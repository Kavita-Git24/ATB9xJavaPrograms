package Nov.ex_18112024_Exception_Part2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Lab186_Multiple_Catches {
    public static void main(String[] args) {
        int b= 0;
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            b = 100/a;
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }


    }
}
