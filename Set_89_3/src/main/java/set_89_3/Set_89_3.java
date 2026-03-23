
package set_89_3;

public class Set_89_3 {
    public static void main(String args[])
    {
        int x[]={23,44,56,79,90,12,33,37,89,24};
        System.out.println("Given array elements are ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+",");
        }
        EvenArray ea=new EvenArray();
        ea.a=x;
        
        int EA[]=ea.getEvenArray();
        System.out.println("\nEven array elements are ");
        for(int i=0;i<EA.length;i++)
        {
            System.out.print(EA[i]+",");
        }
    }
}
