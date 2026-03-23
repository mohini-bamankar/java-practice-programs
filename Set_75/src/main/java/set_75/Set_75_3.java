
package set_75;

import java.util.Scanner;

public class Set_75_3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("The entered array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Position="+i+" Element="+a[i]);
        }
        
        int e_sum=0,o_sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                e_sum=e_sum+a[i];
            else
                o_sum=o_sum+a[i];
        }
        System.out.println("Even Sum="+e_sum+"\nOdd Sum="+o_sum);
    }
}
