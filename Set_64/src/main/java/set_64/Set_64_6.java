
package set_64;

import java.util.Scanner;

public class Set_64_6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 4 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int big1, big2, big;
        
        if(a>b)
            big1=a;
        else
            big1=b;
        
        if(c>d)
            big2=c;
        else
            big2=d;
        
        if(big1>big2)
            big=big1;
        else
            big=big2;
        
        System.out.println(big+" is biggest");
    }
}