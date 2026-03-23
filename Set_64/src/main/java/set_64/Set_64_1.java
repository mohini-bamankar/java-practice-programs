
package set_64;

import java.util.Scanner;

public class Set_64_1 {
    public static void main(String args[])
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a character : ");
        String line = sc.nextLine();
        char ch = line.charAt(0);
        System.out.println("Character = "+ch);
        
        int ascii = (int) ch;
        System.out.println("Ascii value = "+ascii);
        
        if(ascii>=65 && ascii<=90)
        {
            System.out.println("The given character is Uppercase.");
        }
        else if(ascii>=97 && ascii<=122)
        {
            System.out.println("The given character is Lowercase");
        }
        else if(ascii>=48 && ascii<=57)
        {
            System.out.println("The given character is Digit.");
        }
        else
        {
            System.out.println("The given character is Special character");
        }
    }
}
