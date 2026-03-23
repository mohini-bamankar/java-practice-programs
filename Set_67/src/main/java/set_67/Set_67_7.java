
package set_67;

import java.util.Scanner;

public class Set_67_7 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int sp=0;sp<(num-i);sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
