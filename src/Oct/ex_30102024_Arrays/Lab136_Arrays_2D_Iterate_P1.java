package Oct.ex_30102024_Arrays;

public class Lab136_Arrays_2D_Iterate_P1 {
    public static void main(String[] args) {
        String[][] matrix={{"Ritik","Suman"},{"Sahil","Rekha"},{"Gopal","Gopika"}};
        //R->3
        //C->2
        for(int i =0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }
}
