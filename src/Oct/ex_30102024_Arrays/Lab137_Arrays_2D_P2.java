package Oct.ex_30102024_Arrays;

public class Lab137_Arrays_2D_P2 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5},
                {7,8,9}
        };
        //R->3

        for(int i =0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();

        }

        int[][] matrix2={
                {1,2,3},
                {4,5},
                {7},
                {8}
        };
        //R->4

        for(int i =0;i<matrix2.length;i++)
        {
            for (int j=0;j<matrix2[i].length;j++)
            {
                System.out.print(matrix2[i][j] + " " );
            }
            System.out.println();

        }
    }
}
