package Nov.ex_18112024_Exception_Part2;

public class Lab188_Multiple_Try {
    public static void main(String[] args) {
        String ip= null;
        try {
            ip = args[0];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a=0;
        try {

             a=Integer.parseInt(ip);

        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b= 0;
        try {
            b = 100/a;
        }
        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");


    }
}
