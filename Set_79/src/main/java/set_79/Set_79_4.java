
package set_79;

import java.util.Scanner;

public class Set_79_4 {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order of Matrix : ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("ROW="+row+" COLUMN="+col);
        int mat[][]=new int[row][col];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix is");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                sum=sum+mat[i][j];
            }
        }
        System.out.println("The sum of matrix is "+sum);
     
    }
}
