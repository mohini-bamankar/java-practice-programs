
package average;

public class Array {
    public double getArrayAv(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        
        double avg=(double)sum/a.length;
        return avg;
    }
}
