package Oct.ex_25102024_String;

public class Lab122_String_Equals {
    public static void main(String[] args) {

        String s1="hello"; //SCP
        String s2="hello"; //SCP
        String s3="Hello"; //SCP

        String s4=new String("Hello");
        String s5=new String("Hello");
        String s6=new String("hello");

        //== compares reference location
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s5);

        /*String s1="hello"; //SCP
        String s2="hello"; //SCP
        String s3="Hello"; //SCP

        String s4=new String("Hello");
        String s5=new String("Hello");
        String s6=new String("hello");*/


        //equals checks the content
        System.out.println("Equals compares content");
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s6));
        System.out.println(s4.equals(s5));


    }
}
