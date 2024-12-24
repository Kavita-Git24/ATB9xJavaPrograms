package Java_Practice.String;

import java.util.Arrays;

public class longest_common_prefix {
    public static void main(String[] args) {
        String[] prefix_words={"floor","flop","float","flont"};
        String result=longestcommonprefix(prefix_words);
        System.out.println("Prefix:" +result);
    }
    public static String longestcommonprefix(String[] strs)
    {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[1];
        int idx=0;
        while(idx<str1.length() && idx<str2.length()){
            if(str1.charAt(idx) == str2.charAt(idx))
            {
                idx++;
            }
            else
            {
                break;
            }
        }
        return str1.substring(0,idx);

    }
}
