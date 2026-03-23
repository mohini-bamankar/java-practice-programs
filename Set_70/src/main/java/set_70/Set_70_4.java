
package set_70;

import java.util.Scanner;

public class Set_70_4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        
        int total_sp=(n+2);
        
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int sp=total_sp;sp>=1;sp--)
            {
                System.out.print("*");
            }
            total_sp -=2;
            int x=(i==n)?(n-1):i;
            
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
