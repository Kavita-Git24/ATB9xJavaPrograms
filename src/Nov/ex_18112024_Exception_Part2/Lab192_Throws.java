package Nov.ex_18112024_Exception_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab192_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        //Throws - It is used whenever there is checked exception
        FileInputStream fileInputStream=new FileInputStream("C.txt");
    }
}
