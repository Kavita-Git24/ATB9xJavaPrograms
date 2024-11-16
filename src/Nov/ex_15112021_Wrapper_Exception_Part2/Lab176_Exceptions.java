package Nov.ex_15112021_Wrapper_Exception_Part2;

import java.io.FileInputStream;

public class Lab176_Exceptions {
    public static void main(String[] args) {
        //Checked Exception - JVM knows
        //FileInputStream file = new FileInputStream("C://a.txt");
        //JVM knows that this may lead to file not found exception
        // so it telling to handle it.

        //Unchecked Exception - JVM doesn't know it
        int a=10;
        int b=10;
        b=0;
        int c=a/b;
        System.out.println(c);

    }
}
