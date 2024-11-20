package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab201_lists {
    public static void main(String[] args) {
        List list= new ArrayList();//Arrays Format - Continuous
        List list1=new LinkedList();//Doubly linked list
        //How they are stored in memory


        List fruits=List.of("apple","Orange");
        fruits.add("Watermelon");//java.lang.UnsupportedOperationException
    }
}
