
package set_70;

import java.util.Scanner;

public class Set_70_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int k=(n-1);k>=i;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
