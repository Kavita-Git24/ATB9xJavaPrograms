package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("bread");
        list.add("butter");
        list.add("milk");
        list.add("buttermilk");
        list.add("jam");
        list.add("cheeze");
        list.add("paneer");

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.indexOf("jam"));
        System.out.println(list.contains(1));
        System.out.println("------Default for loop");
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("------ for each loop");
        for(Object o:list)
        {
            System.out.println(o);
        }

        System.out.println("------ Iterator");
        //Iterator - Anchor -go one by one forward->get access them
        //HasNext()-> true -If we have a next element
        //Next -> element

        Iterator iterator= list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
