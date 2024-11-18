package Nov.ex_15112024_Wrapper_Exception_Part2;

public class Lab179_Exception_Handle {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try
        {
            b=10/c;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
