
package set_106;

import java.util.ArrayList;

public class Set_106_9 
{
     public static void main(String[] args) 
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(18);
        x.add(25);
        x.add(57);
        x.add(45);
        x.add(26);
        x.add(64);
        x.add(37);
        x.add(40);
        x.add(24);
        x.add(33);
        
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(15000);
        y.add(29000);
        y.add(68000);
        y.add(52000);
        y.add(32000);
        y.add(80000);
        y.add(41000);
        y.add(45000);
        y.add(26000);
        y.add(33000);
        
        int x_sum=0 ,y_sum=0, mul=1,mul_sum=0;
        double sq_x=0, sq_y=0;
        double r = 0;
        for(int i=0; i<x.size();i++)
        {
            int element = x.get(i);
            int ele = y.get(i);
            //System.out.println(i+"] "+"x= "+element+" y= "+ele);
            
            x_sum = x_sum + element;
            y_sum = y_sum + ele;
            
            mul = element * ele;
            mul_sum = mul_sum + mul;
            
            sq_x = sq_x + Math.pow(element, 2);
            sq_y = sq_y + Math.pow(ele, 2);
            
            int nominator = mul_sum -(mul_sum/10);
            
            //double a= Math.sqrt(x_sum - ((Math.pow(sq_x, 2))/10));
            double a= Math.sqrt(sq_x -((Math.pow(x_sum, 2))/10));
            double b= Math.sqrt(sq_y- ((Math.pow(y_sum, 2))/10));
            
            double denominator = a*b;
            //System.out.println( nominator);
            //System.out.println( a);
            //System.out.println( b);
            r=nominator/denominator;
            
        }
        //System.out.println(x_sum+ " "+ y_sum);
        //System.out.println(mul_sum);
        //System.out.println(sq);
        System.out.println( r);
    }
}
