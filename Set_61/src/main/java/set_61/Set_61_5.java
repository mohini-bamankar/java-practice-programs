
package set_61;

import java.util.Scanner;

public class Set_61_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem=a%b;
        System.out.println("Remainder = "+rem);
    }
}
