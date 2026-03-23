
package set_67;

import java.util.Scanner;

public class Set_67_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
