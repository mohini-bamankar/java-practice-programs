
package set_73;

import java.util.Scanner;

public class Set_73_10 {
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter two numers : ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            System.out.println("What would you like to perform \n+.Addition \n-.Susbtraction \n*.Multiplication \n/.Division \n%.Remender");
            Scanner sc1=new Scanner(System.in);
            String line=sc1.nextLine();
            char choice=line.charAt(0);
            
            switch(choice)
            {
                case '+':int sum=a+b;
                    System.out.println("SUM="+sum);
                    break;
                    
                case '-':int sub=a-b;
                    System.out.println("SUB="+sub);
                    break;
                    
                case '*':int mul=a*b;
                    System.out.println("MUL="+mul);
                    break;
                    
                case '/':int div=a/b;
                    System.out.println("DIV="+div);
                    break;
                    
                case '%':int rem=a%b;
                    System.out.println("REM="+rem);
                    break;
                    
                default :
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("DO YOU WANT TO CONTINUE OR NOT?   press(1/0)");
            count=sc.nextInt();
        }while(count==1);
    }
}
