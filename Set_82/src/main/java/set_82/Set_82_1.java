
package set_82;

import java.util.Random;

public class Set_82_1 {
    public static void main(String args[])
    {
        int mat[][]=new int[5][5];
        Random r=new Random();
        int low=0,high=9;
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=r.nextInt(high-low)+low;
            }
        }
        
        System.out.println("Generated Matrix is :");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
