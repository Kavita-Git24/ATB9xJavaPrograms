package Java_Practice;

public class duplicate_element_array {
    public static void main(String[] args) {
        int[] a={10,12,15,10,8,12};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[i]);
            }
        }
    }
}
