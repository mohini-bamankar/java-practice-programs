
package set_61;

import java.util.Scanner;

public class Set_61_6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int items=sc.nextInt();
        float dozen=items/12;
        System.out.println(items+" Items = "+dozen+" Dozen");
    }
}
