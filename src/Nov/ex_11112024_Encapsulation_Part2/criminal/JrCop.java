package Nov.ex_11112024_Encapsulation_Part2.criminal;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop=new Cop(5);
        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
