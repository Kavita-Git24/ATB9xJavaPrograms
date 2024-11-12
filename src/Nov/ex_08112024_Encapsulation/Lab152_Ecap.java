package Nov.ex_08112024_Encapsulation;

public class Lab152_Ecap {
    public static void main(String[] args) {
        VWOLogin vwo=new VWOLogin("admin","password");
        System.out.println(vwo.password);
        vwo.password="hacker";
        System.out.println(vwo.password);

        GoodVWOLogin gvwo=new GoodVWOLogin("admin","password");
        //String pass= gvwo.giveMePassword(false);
        String pass=gvwo.getPassword(true);
        System.out.println(pass);
    }
}

class VWOLogin
{
    public String username;
    public String password;

    public VWOLogin(String username, String password)
    {
        this.username=username;
        this.password=password;
    }
}

class GoodVWOLogin
{
    public String getUsername() {
        return username;
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin)
        {
            return password;
        }
        return "None";
    }

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public GoodVWOLogin(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    public String giveMePassword(boolean isAuth)
    {
        if(isAuth)
        {
            return username;
        }
        return "None";
    }
}
