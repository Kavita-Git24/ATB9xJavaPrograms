package Nov.ex_18112024_Exception_Part2;

public class Lab182_Exceptions_OKOK {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try{
             c=10/a;
             String s1=null;
             s1.trim();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);//ArithmeticException
    }
}
