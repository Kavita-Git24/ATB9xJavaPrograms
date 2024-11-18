package Nov.ex_18112024_Exception_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab193_Try_Catch_P2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("C.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Yes");
        }
    }
}
