
package set_82;

import java.util.Random;
import java.util.Scanner;

public class Set_82_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & column :");
        int row=sc.nextInt();
        int column=sc.nextInt();
        System.out.println(row+","+column);
        
        int mat[][]=new int[row][column];
        Random r=new Random();
        int low=0,high=9;
        System.out.println("Generated Matrix is : ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=r.nextInt(high-low)+low;
            }
        }
        
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
