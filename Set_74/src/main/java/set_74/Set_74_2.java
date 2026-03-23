
package set_74;

public class Set_74_2 {
    public static void main(String args[])
    {
        int i=0,num=5;
        double sum=0;
        do
        {
            double value=(double) 1/(i+1);
            //System.out.println(value);
            sum=sum+value;
            i++;
        }while(i<num);
        System.out.println("SUM="+sum);
    }
}
