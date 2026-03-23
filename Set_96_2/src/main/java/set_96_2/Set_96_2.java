
package set_96_2;


public class Set_96_2 
{
    public static void main(String args[])
    {
        Five f=new Five();
        f.callgetA(5);
        f.callgetB(10);
        f.callgetC(7);
        f.callgetD(0);
        f.callgetE(25);
        
        int a[]=f.getArray();
        System.out.println("Array is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ,");
        }
        System.out.println();
        
        new Sort().getSortedInAscending(a);
        System.out.println("Sorted Array is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ,");
        }
        System.out.println();
       
    }
}
 