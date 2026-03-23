
package set_74;

import java.util.Scanner;

public class Set_74_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Entered array is ");
        for(int i=0;i<n;i++)
            System.out.println("The element at position "+i+" is "+a[i]);
    }
}
