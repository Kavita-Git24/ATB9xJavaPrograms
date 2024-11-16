package Nov.ex_14112024_Static_Enum;

public class Lab166 {
    public static void main(String[] args) {
        Automation a1=new Automation();
        Automation a2=new Automation();
        System.out.println(a1.driver);
        System.out.println(a2.driver);
    }
}

class Automation
{
    static String driver="Chrome";
}
