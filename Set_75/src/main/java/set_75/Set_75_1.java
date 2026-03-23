
package set_75;

import java.util.Scanner;

public class Set_75_1 {
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
        
        System.out.println("The entered array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println("The element at a position "+i+" is "+a[i]);
        }
        
        int n_count=0, p_count=0, z_count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
                n_count++;
            else if(a[i]>0)
                p_count++;
            else
                z_count++;
        }
        System.out.println("Negative numbers="+n_count+"\nPositive numbers="+p_count+"\nZero numbers="+z_count);
    }
}
