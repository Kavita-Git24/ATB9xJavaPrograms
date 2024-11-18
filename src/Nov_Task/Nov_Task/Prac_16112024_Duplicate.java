package Nov_Task.Nov_Task;

public class Prac_16112024_Duplicate {
    public static void main(String[] args) {
        String str="Hello World";
        String result=Prac_16112024_Duplicate.Remove_duplicate(str);
        System.out.println(result);
    }

    public static String Remove_duplicate(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }
        return result;
    }
}
