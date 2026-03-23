
package set_72;

public class Set_72_10 {
    public static void main(String args[])
    {
        int num=1001;
        int temp=num,decimal=0,base=1;
        
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            decimal=decimal+rem*base;
            
            base=base*2;
        }
        System.out.println("The decimal equivalent of "+temp+" is "+decimal);
    }
}
