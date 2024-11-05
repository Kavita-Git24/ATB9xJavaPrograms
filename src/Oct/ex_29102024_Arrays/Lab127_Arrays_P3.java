package Oct.ex_29102024_Arrays;

public class Lab127_Arrays_P3 {
    public static void main(String[] args) {
        String[] names1 = {"Amar", "Amit", "Neha"};
        String[] names2 = new String[5];
        names2[0] = "Gita";
        names2[1] = "Hina";
        names2[2] = "Pihu";
        names2[3] = "Kavya";
        names2[4] = "Misha";
        System.out.println(names2.length);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data.length);
    }
}
