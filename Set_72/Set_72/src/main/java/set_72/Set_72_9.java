
package set_72;

public class Set_72_9 {
    public static void main(String args[])
    {
        int num=4;
        int temp=num,binary=0,base=1;
        
        while(num>0)
        {
            int rem=num%2;
            binary=binary+rem*base;
            num=num/2;
            base=base*10;
        }
        
        System.out.println("The binary equivalent of "+temp+" is "+binary);
    }
}
