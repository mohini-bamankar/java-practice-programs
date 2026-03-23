
package set_79;

import java.util.Scanner;

public class Set_79_6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("Enter the elements of an array ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered matrix is ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
       
        System.out.println("Enter the column number whose number is need to be find");
        int col_num=sc.nextInt();
        col_num=col_num-1;
        int col_sum=0;
        if(col_num >=0 && col_num<mat[0].length)
        {
            for(int i=0;i<mat.length;i++)
            {
                col_sum=col_sum+mat[i][col_num];
            }
            col_num=col_num+1;
            System.out.println("SUM="+col_sum);
        }
        else
        {
            System.out.println("Invalid column number");
        }
    }
}