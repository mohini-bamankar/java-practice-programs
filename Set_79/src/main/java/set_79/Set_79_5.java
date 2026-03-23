
package set_79;

import java.util.Scanner;

public class Set_79_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mat[][]={{1,2},{3,4},{5,6}};
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Enter the row number whose sum is need to be find");
        int row_num=sc.nextInt();
        row_num=row_num-1;
        if(row_num>=0 && row_num<mat.length)
        {
            int row_sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                row_sum=row_sum+mat[row_num][j];
            }
            row_num=row_num+1;
            System.out.println("The sum of row number "+row_num+" is "+row_sum);
        }
        else
        {
            System.out.println("Invalid row number");
        }
        
    }
}
