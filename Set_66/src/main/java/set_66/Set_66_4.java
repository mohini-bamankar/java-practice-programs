
package set_66;

import java.util.Scanner;

public class Set_66_4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        boolean flag=true;
        
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println(num+" is Prime.");
        }
        else
        {
            System.out.println(num+" is not prime.");
        }
    }
}
