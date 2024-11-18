package Nov.ex_18112024_Exception_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab191_Unchecked_Checked_Example {
    public static void main(String[] args) {
        int a=0;
        try {
            int x=10/a;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Unchecked!!!");
        }

        try {
            FileInputStream fileInputStream=new FileInputStream("rr.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Checked!!!");
        }
    }
}
