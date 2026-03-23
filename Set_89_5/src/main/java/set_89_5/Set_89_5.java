
package set_89_5;

import java.util.Scanner;

public class Set_89_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        
        System.out.println("enter the elemnts of an arrray");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the element to be inserted");
        int element=sc.nextInt();
        
        System.out.println("enter the position to be inserted");
        int pos=sc.nextInt();
        
        int na[]=new InsertedArray().getInsertedArray(a, element, pos);
        System.out.println("New inserted array is");
        for(int i=0;i<na.length;i++)
        {
            System.out.print(na[i]+",");
        }
        System.out.println("");
    }
}
