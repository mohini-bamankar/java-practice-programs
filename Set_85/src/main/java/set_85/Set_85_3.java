
package set_85;

public class Set_85_3 {
    public static void main(String args[])
    {
        int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The first matrix is ");
        printMatrix(mat1);
        
        int mat2[][]={{2,3,1},{5,6,4},{8,9,7}};
        System.out.println("The second matrix is ");
        printMatrix(mat2);
        
        int mat_sum[][] = getSum(mat1,mat2);
        System.out.println("The sum of given two matrix is : ");
        printMatrix(mat_sum);
        
    }

    public static int[][] printMatrix(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        return mat;
    }
    
    public static int[][] getSum(int[][] mat1,int[][]  mat2)
    {
        int sum_mat[][]=new int[mat1[0].length][mat1.length];
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[0].length;j++)
            {
                sum_mat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        return sum_mat;
    }
}
