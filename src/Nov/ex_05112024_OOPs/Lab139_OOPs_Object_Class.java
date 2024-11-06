package Nov.ex_05112024_OOPs;

public class Lab139_OOPs_Object_Class {
    public static void main(String[] args) {
        StudentsATB s1=new StudentsATB();

        //StudentsATB-> Class Loading
        //s1-> Object reference
        // new StudentsATB() -> Object Creation (this part is also called Object)
        //s1 is not object it's Object reference

        s1.name="Nisha";
        s1.eat(10);
        System.out.println(s1);

        StudentsATB s2=new StudentsATB();
        s2.name="Piyush";
        s2.eat(20);
        System.out.println(s2);


        Person p1;
        //Person-> Class Loading
        //p1->ref->null (by default non primitive value is null)
        //Byte Bits->8 64

    }
}
