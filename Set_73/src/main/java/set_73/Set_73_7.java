
package set_73;

public class Set_73_7 {
    public static void main(String args[])
    {
        int i=1;
        do
        {
            if(i%4==0 && i%5==0)
            {
                System.out.print(i+",");
            }
            i++;
        }while(i<=100);
    }
}
