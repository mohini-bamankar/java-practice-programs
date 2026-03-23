
package set_74;

import java.util.Scanner;

public class Set_74_9 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Entered array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println("The element at position "+i+" is "+arr[i]);
        }
        
        int big=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>big)
                big=arr[i];
        }
        System.out.println("BIG = "+big);
    }
}
