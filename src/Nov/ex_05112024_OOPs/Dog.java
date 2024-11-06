package Nov.ex_05112024_OOPs;

public class Dog {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Broono";
        d1.breed="Julie";
        d1.color="White";
        d1.view_dog_details();

        Dog d2=new Dog();
        d2.name="Moti";
        d2.breed="Julie";
        d2.color="White";
        d2.view_dog_details();

        Dog d3=new Dog();
        d3.name="Pluto";
        d3.breed="ChowChow";
        d3.color="brown";
        d3.view_dog_details();

        Dog d4=new Dog();
        d4.name="Tiger";
        d4.breed="Asian";
        d4.color="black";
        d4.view_dog_details();

        Dog d5=new Dog();
        d5.name="Snowy";
        d5.breed="Zuzu";
        d5.color="White";
        d5.view_dog_details();
    }
    String name;
    String breed;
    String color;




    void view_dog_details()
    {
        System.out.println("Name->" +name +" Breed->" +breed +" Color->" +color);
    }
}
