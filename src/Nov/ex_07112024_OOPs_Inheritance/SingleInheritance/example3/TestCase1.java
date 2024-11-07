package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.example3;

public class TestCase1 extends  Common_BaseTest{
    TestCase1()
    {
        System.out.println("DC - Child");
    }

    void testcase()
    {
        start_Browser();
        Read_file();
        close_Browser();
    }




}
