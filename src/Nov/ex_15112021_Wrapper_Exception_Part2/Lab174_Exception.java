package Nov.ex_15112021_Wrapper_Exception_Part2;

public class Lab174_Exception {
    public static void main(String[] args) {
        String ip=args[0];//ArrayIndexOutofBound Exception
        int a= Integer.parseInt(ip);//NumberFormat Exception
        int b=1000/a;//Arithmetic Exception
        System.out.println(b);
        System.out.println("End of Program");

        //JVM will be initialized(From RAM)
        //Creates and Starts the main thread. - Main Called
        //1)Collects the command line Arguments - 10
        //String[] args = {10}
        //2) Lab174_Exception.main()
        //Now control will be transferred from main thread to main method
        //When problem comes in main-> JVM
        //If you don't handle the problem JVM will handle it
        //Always terminate the program with exception

    }

}
