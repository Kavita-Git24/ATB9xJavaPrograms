package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab124_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        StringBuilder sbl=new StringBuilder("John ");
        sbl.append("Reddy");
        System.out.println(sbl);

        StringBuffer sbf=new StringBuffer("James ");
        sbf.append("Sterling");
        System.out.println(sbf);

        StringBuilder sbl1=new StringBuilder("Henry ");
        sbl1.append("Smith");
        System.out.println(sbl1.toString());
    }
}
