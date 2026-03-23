
package set_64;

import java.util.Scanner;

public class Set_64_9 {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter salry : ");
            int sal = sc.nextInt();
            
            if(sal<=15000)
                System.out.println("Peon");
            else if(sal>=15001 && sal<=25000)
                System.out.println("2nd division clerk");
            else if(sal>=25001 && sal<=35000)
                System.out.println("1st division clerk");
            else if(sal>=35001 && sal<=45000)
                System.out.println("Assistant Manager");
            else if(sal>=45001 && sal<=60000)
                System.out.println("Manager");
            else
                System.out.println("Not defined");
        }
}
