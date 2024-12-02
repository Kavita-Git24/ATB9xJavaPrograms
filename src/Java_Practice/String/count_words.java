package Java_Practice.String;

public class count_words {
    public static void main(String[] args) {
        String str="Hello! How are you? I am good";
        String[] words=str.split("\\s");
        System.out.println("Number of words: " +words.length);
        for (int i=0;i< words.length;i++)
        {
            System.out.println(words[i] + words[i].length());
        }
        //count_no_words(String);
     }
}
