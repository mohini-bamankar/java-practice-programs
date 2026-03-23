
package set_80;

public class Set_80_4 {
    public static void main(String args[])
    {
        int mat[][]={{1,2,4},{4,5,6},{7,8,9}};
        if(mat.length==mat[0].length)
        {
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            
            for(int j=0;j<mat[0].length;j++)
            {
                int temp=mat[j][j];
                mat[j][j]=mat[j][j-mat[0].length-1];
                mat[j][mat[0].length-1-j]=temp;
            }
            System.out.println("Interchanged Matrix is");
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    
        else
        {
            System.out.println("Given order is not symmetric");
        }
    }
}
