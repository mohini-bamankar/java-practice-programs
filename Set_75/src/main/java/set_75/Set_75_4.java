
package set_75;

import java.util.Scanner;

public class Set_75_4 {
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
        
        System.out.println("Entered array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Position="+i+" Element="+a[i]);
        }
        
        int even[]=new int[n];
        int odd[]=new int[n];
        
        System.out.println("Even array :");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
               even[i]=a[i];
               System.out.print(even[i]+" , ");
            }
        }
        System.out.println("");
        System.out.println("Odd array :");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
               odd[i]=a[i];
               System.out.print(odd[i]+" , ");
            }
        }
    }
}
