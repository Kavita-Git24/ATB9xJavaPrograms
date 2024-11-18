package Nov.ex_18112024_Exception_Part2;

public class Lab194_Custom_Exception {
    public static void main(String[] args) throws Exception {
        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",120);
        System.out.println(sbi.add(icici));
        Bank jsp_morgan=new Bank("USD",500);
        System.out.println(sbi.add(jsp_morgan));
    }
}
