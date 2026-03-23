
package set_73;

public class Set_73_9 {
    public static void main(String args[])
    {
        int f1=-1,f2=1,f3,n=10,count=0;
        do
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            count++;
        }while(count<=n);
    }
}
