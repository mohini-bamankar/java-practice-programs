
package diagonal;

public class Principal {
    public int getPrincipal(int mat[][])
    {
        int temp=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                {
                    temp=mat[i][j];
                }
            }
        }
        return temp;
    }
}
