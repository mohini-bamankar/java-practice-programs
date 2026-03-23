package set_91_5;

import java.util.Scanner;

public class Student {
    
    int rollno;
    String  name;
    float percentage;
    
    void getData()
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
       
        rollno = sc1.nextInt();
        name = sc2.nextLine();
        percentage = sc3.nextFloat();
        
    }
}
