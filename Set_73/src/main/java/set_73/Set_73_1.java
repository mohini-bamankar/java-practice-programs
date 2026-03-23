
package set_73;

public class Set_73_1 {
    public static void main(String args[])
    {
        int num=9;
        int temp=num,octal=0,base=1;
        
        while(num>0)
        {
            int rem=num%8;
            num=num/8;
            octal=octal+rem*base;
            base=base*10;
        }
        System.out.println("The octal equivalent of "+temp+" is "+octal);
    }
}
