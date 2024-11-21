package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
//        Stack s=new Stack();
//        s.add("Toran");
//        s.add("hiral");
//        System.out.println(s);

        Stack s=new Stack();
        s.push("Atharv");
        s.push("Ashish");
        s.push("Abhit");
        s.push("Avinash");
        s.push("Avantika");
        s.add("Aaryan");

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.contains("Aaryan"));
        System.out.println(s.add("Aaryan"));
        System.out.println(s);
        s.add(1,"Mahima");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}
