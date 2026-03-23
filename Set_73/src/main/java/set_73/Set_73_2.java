
package set_73;

public class Set_73_2 {
    public static void main(String args[])
    {
        int num=15;
        int temp=num,decimal=0,base=1;
        
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            decimal=decimal+rem*base;
            base=base*8;
        }
        System.out.println("The decimal equivalent of "+temp+" is "+decimal);
    }
}
