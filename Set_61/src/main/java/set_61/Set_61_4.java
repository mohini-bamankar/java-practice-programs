
package set_61;

import java.util.Scanner;

public class Set_61_4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("a="+a+" b="+b);
        a=a+b;   //a=5+7=12
        b=a-b;   //b=12-7=5
        a=a-b;   //a=12-5=7
        System.out.println("After swapping");
        System.out.println("a="+a+" b="+b);
    }
}
