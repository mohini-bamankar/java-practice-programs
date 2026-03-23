
package set_79;

import java.util.Scanner;

public class Set_79_7 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of matrix");
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
        
        System.out.println("The entered matrix is");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        int cont=0;
        do
        {
            System.out.println("Your options are \n1.Interchange columns \n2.Display Matrix");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1 : System.out.println("Enter the two columns to be exchanged");
                         int c1=sc.nextInt();
                         int c2=sc.nextInt();
                         
                         if((c1>=1 && c1<=col) && (c2>=1 & c2<=col))
                         {
                             c1=c1-1;
                             c2=c2-1;
                             for(int i=0;i<mat.length;i++)
                             {
                                 int temp=mat[i][c1];
                                 mat[i][c1]=mat[i][c2];
                                 mat[i][c2]=temp;
                             }
                             System.out.println("Column are exchanged successfully.");
                         }
                         else
                         {
                             System.out.println("Columns are out of range.");
                         }
                         break;
                         
                case 2 :  System.out.println("Resulted Matrix is ");
                           for(int i=0;i<mat.length;i++)
                           {
                               for(int j=0;j<mat[0].length;j++)
                               {
                                   System.out.print(mat[i][j]+" ");
                               }
                               System.out.println();
                           }
                           break;
                                   
                default : System.out.println("Invalid");
                           break;
            }
            
            System.out.println("Do you want to continue or not.\n1.YES \n2.NO");
            cont=sc.nextInt();
            System.out.println("----------------------------------------------------------------------------------------");
        }while(cont==1);
        
    }
}
