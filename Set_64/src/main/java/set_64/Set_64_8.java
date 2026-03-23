
package set_64;

import java.util.Scanner;

public class Set_64_8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        double mark=sc.nextDouble();
        
        if(mark>=0 && mark<=35)
            System.out.println("Fail.");
        else if(mark>=36 && mark<=40)
            System.out.println("Pass class.");
        else if(mark>=41 && mark<=50)
            System.out.println("3rd division.");
        else if(mark>=51 && mark<=60)
            System.out.println("2nd division.");
        else if(mark>=61 && mark<=70)
                System.out.println("1st division.");
        else if(mark>=71 && mark<=100)
            System.out.println("Distinction.");
        else
            System.out.println("Not applicable");
    }
}
