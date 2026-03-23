
package set_80;

public class Set_80_2 {
    public static void main(String args[])
    {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        if(mat.length==mat[0].length)
        {
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            
            int sum=0;
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    if(i==j)
                    {
                        sum=sum+mat[i][j];
                    }
                }
            }
            System.out.println("SUM="+sum);
        }
        else
        {
            System.out.println("Given order is not symmetric");
        }
    }
}
