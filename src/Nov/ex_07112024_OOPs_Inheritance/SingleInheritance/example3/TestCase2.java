package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.example3;

public class TestCase2 extends  Common_BaseTest{
    TestCase2()
    {
        System.out.println("DC - Child");
    }

    void testcase2()
    {
        start_Browser();
        System.out.println("Executing TestCase2");
        Read_file();
        close_Browser();
    }




}
