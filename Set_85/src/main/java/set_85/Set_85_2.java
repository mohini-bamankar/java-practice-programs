
package set_85;

public class Set_85_2 {
    
    public static void main(String args[])
    {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The given matrix is ");
        printMatrix(mat);
        
        int s_diagonal[][]=getElement(mat); 
        System.out.println("The second diagonal elements are : ");
        printMatrix(s_diagonal);
    }
    
    public static int[][] getElement(int mat[][])
    {
        int diagonal[][]=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                    diagonal[i][j]=mat[i][j];
                    //System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        return diagonal;
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
}
