
package set_64;

import java.util.Scanner;

public class Set_64_5 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any 3 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int big;
        if(a>b)
        {
            if(a>c)
                big=a;
            else
                big=c;
        }
        else
        {
            if(b>c)
                big=b;
            else
                big=c;
        }
        System.out.println(big+" is greatest.");
    }
}
