
package set_64;

import java.util.Scanner;


public class Set_64_3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b)==c)
        {
            System.out.println("The given numbers are the part of fabonacci series.");
        }
        else
        {
            System.out.println("The given numbers are not the part of fabonacci series.");
        }
    }
}
