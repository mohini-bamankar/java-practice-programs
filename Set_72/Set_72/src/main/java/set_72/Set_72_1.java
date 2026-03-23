
package set_72;

import java.util.Scanner;

public class Set_72_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        
        int fact=1;
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial = "+fact);
        
    }
}
