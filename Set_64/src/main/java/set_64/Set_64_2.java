
package set_64;

import java.util.Scanner;

public class Set_64_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle : ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b)
        {
            if(a==b && b==c)
            {
                System.out.println("Equilateral triangle");
            }
            else if(a==b || b==c || c==a)
            {
                System.out.println("Isoceles triangle");
            }
            else
            {
                System.out.println("Scalene triangle");
            }
        }
        else
        {
            System.out.println("Triangle can not be defined");
        }
    }
}
