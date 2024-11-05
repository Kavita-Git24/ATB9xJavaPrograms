package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab123_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. 0 roar again!";
        String roar=anotherPalindrome.substring(11,15);
        System.out.println(roar);

        //substring
        String s1="Yogesh";
        String s2=s1.concat("Dongre");
        System.out.println(s2);

        String fruits="apple,banana,cherry"; //delimiter ,
        String[] split_fruits=fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String alphabets="ABC-XYZ-PQR"; //delimiter |
        String[] alphabets_split=alphabets.split("-");
        System.out.println(alphabets_split[0]);
        System.out.println(alphabets_split[1]);
        System.out.println(alphabets_split[2]);

        String s4= "Monster";
        System.out.println(s4.charAt(5));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5= " Welcome ";
        System.out.println(s5.trim());

        String s6="Paris";
        System.out.println(s6.indexOf("P"));
        System.out.println(s6.indexOf("s"));

        String s7="Paris";
        System.out.println(s7.contains("ar"));
        System.out.println(s7.contains("is"));

        String s8= " Welcome ";
        System.out.println(s8.lastIndexOf("e"));

        String s9= " Welcome ";
        System.out.println(s9.replace("e","a"));

        String s10= " Welcome123to456String789!";
        System.out.println(s10.replaceAll("\\d+"," "));

        String s11= "Welcome to String";
        System.out.println(s11.startsWith("Wel"));
        System.out.println(s11.endsWith("ing"));
    }
}
