package set_62;

import java.util.Scanner;

public class Set_62_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of triangle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s=(double)(a+b+c)/2;
        System.out.println("s = "+s);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle = "+area);
    }
}
