package Java_Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1="silent";
        String string2="listen";

        boolean is_anagram=areAnagrams(string1,string2);
        if(is_anagram==true)
            System.out.println("String is anagram");
        else
            System.out.println("String is not anagram");
    }
    public static boolean areAnagrams(String s1,String s2)
    {
        // Remove all non -aplhabetic characters
        s1.replaceAll("[^A-Za-z]","").toLowerCase();
        s2.replaceAll("[^A-Za-z]","").toLowerCase();

        //checks if lengths are different
        if(s1.length()!=s2.length()){
            return false;
        }

        //Sort the characters of Strings
        char[] char1=s1.toCharArray();
        Arrays.sort(char1);
        char[] char2=s2.toCharArray();
        Arrays.sort(char2);

        //Compare Sorted array
        for(int i=0;i<char1.length;i++)
        {
            if(char1[i]!=char2[i]) {
                return false;
            }
        }
        return true;
    }
}
