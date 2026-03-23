
package set_89_7;

public class Conversion {
    int[] getBinaryArray(int dec[])
    {
        for(int i=0;i<dec.length;i++)
        {
            int num=dec[i];
            int binary=0,base=1;
            while(num>0)
            {
                int rem=num%2;
                binary=binary+rem*base;
                base=base*10;
                num=num/2;
            }
            dec[i]=binary;
        }
        return dec;
    }
}
