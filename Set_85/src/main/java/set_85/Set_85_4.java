
package set_85;

public class Set_85_4 {
    public static void main(String args[])
    {
        int mat[][]={{1,2,7},{3,4,8},{5,6,9}};
        System.out.println("Given matrix is :");
        printMatrix(mat);
        
        int transpose[][]= getTranspose(mat);
        System.out.println("The transpose matrix is :");
        printMatrix(transpose);
    }
    
    public static int[][] getTranspose(int mat[][])
    {
        int trans[][]=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                trans[j][i]=mat[i][j];
            }
        }
        return trans;
    }
    
    public static int[][] printMatrix(int mat[][])
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
}
