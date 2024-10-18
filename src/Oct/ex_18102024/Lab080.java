package Oct.ex_18102024;

public class Lab080 {
    public static void main(String[] args) {
        int itemcode=003;
        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("All electronics gadgets");
                break;
            case 005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
