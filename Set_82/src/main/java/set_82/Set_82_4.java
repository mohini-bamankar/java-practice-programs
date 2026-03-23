
package set_82;

import java.util.Random;
import java.util.Scanner;

public class Set_82_4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & column : ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        
        Random r= new Random();
        int mat[][]=new int[row][column];
        int low=0,high=9;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=r.nextInt(high-low)+low;
            }
        }
        
        System.out.println("Generated matrix is ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        int big_row_index=0, big_sum=0, small_row_index=0, small_sum=100;
        
        for(int i=0;i<mat.length;i++)
        {
            int temp_row_sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                temp_row_sum = temp_row_sum + mat[i][j];
                
                if(temp_row_sum>big_sum)
                {
                    big_sum=temp_row_sum;
                    big_row_index=i;
                }
                
                if(temp_row_sum < small_sum)
                {
                    small_sum=temp_row_sum;
                    small_row_index=i;
                }
            }
            System.out.println("SUM="+temp_row_sum);
        }
        System.out.println("Biggest Sum = "+big_sum+"\nSmallest sum = "+small_sum);
    }
}
