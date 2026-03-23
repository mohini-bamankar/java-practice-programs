
package set_62;

import java.util.Scanner;

public class Set_62_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X co-ordinates : ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        System.out.println("Enter Y co-ordinates : ");
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("x1="+x1+" x2="+x2+" y1="+y1+" y2="+y2);
        
        double v1=(double)Math.pow((x1-x2),2);
        double v2=(double)Math.pow((y1-y2),2);
        double sum=v1+v2;
        double result=Math.sqrt(sum);
        System.out.println("Distance is "+result);
    }
}
