
package set_80;

public class Set_80_1 {
    public static void main(String args[])
    {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
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
            
            System.out.println("secondary digonal elements are");
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    if(i+j==mat.length-1)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    else
                        System.out.print(" ");
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
