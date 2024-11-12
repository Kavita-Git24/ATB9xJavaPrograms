package Nov.ex_11112024_Encapsulation_Part2.REAL;

public class TestCases1 extends  BaseClass{
    public TestCases1()
    {
        super();
        System.out.println("DC - TC1");
    }
    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }


}
