package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_22102021_vowel_conso {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String st=sc.next().toLowerCase();
        String temp;
        int vowel=0;
        int conso=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='a' || st.charAt(i)=='e'|| st.charAt(i)=='i'|| st.charAt(i)=='o'|| st.charAt(i)=='u')
            {
                vowel++;
            }
            else
            {
                conso++;
            }
        }
        System.out.println("Total number of Vowel character" +vowel);
        System.out.println("Total number of Consonant character" +conso);
    }
}
