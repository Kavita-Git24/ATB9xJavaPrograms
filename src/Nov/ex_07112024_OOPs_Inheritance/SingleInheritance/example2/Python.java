package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.example2;

public class Python extends Programming{
    Python()
    {
        System.out.println("DC");
    }
    void print()
    {
        System.out.println(author);
        System.out.println(version);
    }

    public static void main(String[] args) {
        Python p1=new Python();
        System.out.println(p1.author);
    }
}
