package Nov.ex_18112024_Exception_Part2;

public class Lab187_Multiple_Catches_OR {
    public static void main(String[] args) {
        int b= 0;
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            b = 100/a;
        }
        catch (NumberFormatException |ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }


    }
}
