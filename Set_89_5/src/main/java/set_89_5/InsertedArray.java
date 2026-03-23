
package set_89_5;

public class InsertedArray {
    
    int[] getInsertedArray(int a[],int element,int pos)
    {
        int na[]=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            na[i]=a[i];
        }
        pos=pos-1;
        for(int i=na.length;i>=pos;i--)
        {
            na[i+1]=na[i];
        }
        na[pos]=element;
        return na;
    }
}
