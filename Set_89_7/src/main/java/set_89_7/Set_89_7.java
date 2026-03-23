
package set_89_7;

public class Set_89_7 {
    public static void main(String args[])
    {
        int dec[]={5,16,7,8,9};
        System.out.println("Decimal array is");
        for(int i=0;i<dec.length;i++)
        {
            System.out.print(dec[i]+",");
        }
        System.out.println();
        
        Conversion cv=new Conversion();
        int bin[]=cv.getBinaryArray(dec);
        System.out.println("Binary array is");
        for(int i=0;i<bin.length;i++)
        {
            System.out.print(bin[i]+",");
        }
        System.out.println();
    }
}
