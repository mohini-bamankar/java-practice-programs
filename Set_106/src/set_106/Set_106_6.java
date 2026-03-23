
package set_106;

import java.util.ArrayList;


public class Set_106_6 
{
     public static void main(String[] args) 
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(10001110);
        data.add(1111);
        data.add(0001);
        data.add(10101001);
        data.add(00010011);
        
        for(int i=0;i<data.size();i++)
        {
            int element=data.get(i);
            int decimal=0,base=1;
            while(element>0)
            {
                int rem=element%2;
                decimal=decimal+rem*base;
                base=base*2;
                element=element/10;
            }
            System.out.println("decimal of "+i+" is = "+decimal);
        }
    }
}
