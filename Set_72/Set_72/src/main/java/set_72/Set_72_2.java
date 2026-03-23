
package set_72;

import java.util.Scanner;

public class Set_72_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        
        int sum=0;
        
        while(num>0)
        {
            sum=sum+num;
            num--;
        }
        System.out.println("SUM="+sum);
    }
}
