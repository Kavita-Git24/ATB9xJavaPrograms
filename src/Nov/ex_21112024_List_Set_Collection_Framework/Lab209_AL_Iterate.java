package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab209_AL_Iterate {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList();
        //List list1=new LinkedList();
        list.add("Kamal");
        list.add("Sonam");
        list.add("Mira");
        System.out.println(list);

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        for(String str:list)
        {
            System.out.println(str);
        }

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
