
package set_74;

import java.util.Scanner;

public class Set_74_8 {
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
            System.out.print(a[i]+",");
        }
        
        int e_count=0,o_count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                e_count++;
            else
                o_count++;
        }
        System.out.println("\nEven count = "+e_count+" Odd count = "+o_count);
    }
}
