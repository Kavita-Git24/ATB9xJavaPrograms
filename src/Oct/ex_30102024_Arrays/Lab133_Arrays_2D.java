package Oct.ex_30102024_Arrays;

public class Lab133_Arrays_2D {
    public static void main(String[] args) {
        int[][] array_2d= new int[3][3];
        //3 X 3
        //90 91 92
        //1 2 3
        //3 4 5

        array_2d[0][0]=90;
        array_2d[0][1]=91;
        array_2d[0][2]=92;

        array_2d[1][0]=1;
        array_2d[1][1]=2;
        array_2d[1][2]=3;

        array_2d[2][0]=3;
        array_2d[2][1]=4;
        array_2d[2][2]=5;

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println(array_2d[i][j]);
            }
            System.out.println("");
        }

    }
}
