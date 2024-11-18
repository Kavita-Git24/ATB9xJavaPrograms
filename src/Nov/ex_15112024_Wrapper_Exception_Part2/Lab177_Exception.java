package Nov.ex_15112024_Wrapper_Exception_Part2;

public class Lab177_Exception {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1=null;
        s1.trim();

        System.out.println("End");
        //Unchecked Exception - java.lang.NullPointerException
        //JVM - compile ->JVM knows at Runtime ->Terminated the program
    }
}
