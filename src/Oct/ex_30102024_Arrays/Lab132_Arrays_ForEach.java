package Oct.ex_30102024_Arrays;

public class Lab132_Arrays_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

       /* for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }*/

        for(int i:a)
        {
            System.out.println(i);
        }

        String[] names={"rohan","sania","sonam","rehan","pulkit"};
        for(String name:names)
        {
            System.out.println(name);
        }

        int[] numbers={1,2,3,4,5};
        for (int n:numbers)
        {
            System.out.println(n);
        }
    }
}
