
package set_74;

import java.util.Scanner;

public class Set_74_6 {
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Entered array is : ");
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            System.out.print(a[i]+",");
            //System.out.println("SUM="+sum);
        }
        System.out.println("\nSUM="+sum);
        
    }
}
