
package set_70;

import java.util.Scanner;

public class Set_70_3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        
        int total_space=-1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int sp=1;sp<=total_space;sp++)
            {
                System.out.print(" ");
            }
            
            total_space +=2;
            int x=(i==1)?2:i;
            
            for(int j=x;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
