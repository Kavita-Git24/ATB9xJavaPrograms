package Nov.ex_14112024_Static_Enum;

public class Lab165_Real_SIB_IIB {
    public static void main(String[] args) {
        ATB s1=new ATB("Chandni");
        ATB s2=new ATB("Megha");
        ATB s3=new ATB("Surya");
        ATB s4=new ATB("Naman");
        ATB s5;
        new ATB("Sonam");

        s1.readDocuments();
        s4.readDocuments();

        //static
        ATB.doAssignment();//Static Method
        System.out.println(ATB.coursename); //static variable
    }
}
class ATB{
    {
        System.out.println("IIB");
        //What is the purpose?
        //Here you can write code related to
        //start a website or anything before starting the
        //web automation or api automation
        System.out.println("Reading from CSV file");
   }
   static
   {
       System.out.println("Load the class? I will execute");
   }
    static String coursename="ATB9x";
    private String name;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     void readDocuments(){
         System.out.println("Non Static Method");
         System.out.println(coursename);
     }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignment(){
        //System.out.println(phone); Static funtion is loaded when class loaded
                                    // but phone is not available until object is create

        //Order
//        Static block(SIB)
//        Static instance variable
//        static methods/funtions
//        normal block(IIB)
//        normal instance variable
//        normal methods/funtions
        System.out.println("Do Assigment");
    }

    static class GenAI{
        //0.0001% in Automation
    }

}