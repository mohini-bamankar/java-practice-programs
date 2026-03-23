
package set_96_1;

public class Set_96_1 
{
    public static void main(String args[])
    {
        Five f=new Five();
        f.callgetA(5);
        f.callgetB(10);
        f.callgetC(-15);
        f.callgetD(0);
        f.callgetE(25);
        
        int a[]=f.getArray();
        System.out.println("Array is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ,");
        }
        System.out.println();
        
        int count=f.getCount(a);
        System.out.println(count);
        
        
    }
}
