
package set_75;

import java.util.Scanner;

public class Set_75_9 {
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
        
        System.out.println("Entered array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Position="+i+" Element="+a[i]);
        }
        
        int pos1=-1,pos2=-1;
        System.out.println("Enter the 2 numbers to be swapped.");
        int element1=sc.nextInt();
        int element2=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==element1)
                pos1=i;
            if(a[i]==element2)
                pos2=i;
        }
        
        if(pos1 == -1 || pos2 == -1)
        {
            System.out.println("The given elements are not present in the array.");
        }
        else
        {
            int temp=a[pos1];
            a[pos1]=a[pos2];
            a[pos2]=temp;
            System.out.println("Swapped array is ");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" , ");
            }
        }
        
    }
}
