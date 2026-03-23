
package set_89_4;

public class Set_89_4 {
    public static void main(String args[])
    {
        int x[]={23,44,56,79,90,12,33,37,89,24};
        System.out.println("Given elements are ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+",");
        }
        
        PrimeArray pa=new PrimeArray();
        pa.a=x;
        
        int PA[]=pa.getPrimeArray();
        System.out.println("\nPrime array elements are ");
        for(int i=0;i<PA.length;i++)
        {
            System.out.print(PA[i]+",");
        }
    }
}
