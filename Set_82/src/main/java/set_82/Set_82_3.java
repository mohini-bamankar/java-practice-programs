
package set_82;

import java.util.Random;
import java.util.Scanner;

public class Set_82_3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & column :");
        int row=sc.nextInt();
        int column=sc.nextInt();
        
        int mat[][]=new int[row][column];
        Random r=new Random();
        int low=0,high=50;
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=r.nextInt(high-low)+low;
            }
        }
        
        System.out.println("Generated Matrix is :");
        int big =mat[0][0],small=mat[0][0];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
                if(mat[i][j]>big)
                    big=mat[i][j];
                if(mat[i][j]<small)
                    small=mat[i][j];
            }
            System.out.println();
        }
        System.out.println("Big = "+big + "\nSmall = "+small);
    }
}
