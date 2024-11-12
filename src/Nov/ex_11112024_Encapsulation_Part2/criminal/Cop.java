package Nov.ex_11112024_Encapsulation_Part2.criminal;

public class Cop {
    protected int gun;
    public String iCard;
    public Cop(int gun)
    {
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("Yes,You can!");
    }
}
