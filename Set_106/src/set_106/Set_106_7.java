
package set_106;

import java.util.ArrayList;


public class Set_106_7 
{
     public static void main(String[] args) 
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(9);
        data.add(15);
        data.add(45);
        data.add(72);
        data.add(4);
        
        for(int i=0;i<data.size();i++)
        {
            int element=data.get(i);
            int binary=0,base=1;
            while(element>0)
            {
                int rem=element%2;
                binary=binary+rem*base;
                base=base*10;
                element=element/2;
            }
            System.out.println("Binary of "+i+" is = "+binary);
        }
    }
}
