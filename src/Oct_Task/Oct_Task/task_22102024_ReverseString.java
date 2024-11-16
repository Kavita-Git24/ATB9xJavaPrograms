package Oct_Task.Oct_Task;

public class task_22102024_ReverseString {
    public static void main(String[] args) {
        /*String sentence[]="man bites dog".split(" ");
        String reverse_sentence= "";
        for(int i=sentence.length-1;i>=0;i--)
        {
            reverse_sentence+=sentence[i]+ " ";
        }
        System.out.println("Reverse String-->");
        System.out.print(reverse_sentence.substring(0,reverse_sentence.length()-1));*/

        String sentence="man3 bites1 dog2";
        String revsentence="";
        String temp[]=sentence.split(" ");
        for(int i=temp.length-1;i>=0;i--)
        {
            revsentence+=temp[i]+ " ";
        }
        System.out.println(revsentence);
    }


}
