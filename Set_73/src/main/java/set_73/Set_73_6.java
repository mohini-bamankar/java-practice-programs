
package set_73;

import java.util.Scanner;

public class Set_73_6 {
    public static void main(String args[])
    {
        int i=1,num=5;
        double sum=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number : ");
        int x=sc.nextInt();
        
        while(i<=num)
        {
            double value= (double) i/(x+i);
            sum=sum+value;
            //System.out.println(i+" "+(x+i)+"="+value);
            i++;
        }
        System.out.println("SUM="+sum);
    }
}
