
package set_70;

import java.util.Scanner;

public class Set_70_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        
        for(int i=n;i>=1;i--)
        {
            for(int sp=i;sp>1;sp--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int j=(n-1);j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
