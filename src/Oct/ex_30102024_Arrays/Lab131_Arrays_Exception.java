package Oct.ex_30102024_Arrays;

public class Lab131_Arrays_Exception {
    public static void main(String[] args) {
        int[] a2= new int[5];
        //int[] a3=new int[-1];//NegativeArraySizeException
        //System.out.println(a2[10]);//ArrayIndexOutOfBoundsException
        int[] a8={-8,-3,-95};
        int[] a9=new int[3];
        a9[0]=-8;
        a9[1]=-18;
        a9[2]=-80;
        System.out.println(a9[0]);
        System.out.println(a8[0]);
    }
}
