package Nov.ex_05112024_OOPs;

public class Lab141_OOPs_Object_Class {
    public static void main(String[] args) {
        StudentsATB s3=new StudentsATB();

        //StudentsATB-> Class Loading
        //s1-> Object reference
        // new StudentsATB() -> Object Creation (this part is also called Object)
        //s1 is not object it's Object reference

        s3.name="Shailesh";
        s3.eat(12);
        System.out.println(s3.name);

        StudentsATB s4=new StudentsATB();
        s4.name="Pihu";
        s4.eat(28);
        System.out.println(s4.name);


        Person p1;
        //Person-> Class Loading
        //p1->ref->null (by default non primitive value is null)
        //Byte Bits->8 64

    }
}
