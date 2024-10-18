package Oct.ex_18102024;

public class Lab081 {
    public static void main(String[] args) {
        int itemcode=001;
        switch (itemcode)
        {
            case 001 -> System.out.println("Electronics");
            case 002 -> System.out.println("Mechnilcal");
            case 003 -> System.out.println("Pharma");
            default -> System.out.println("None");
        }
    }
}
