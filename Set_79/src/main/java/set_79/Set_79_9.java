
package set_79;

public class Set_79_9 {
    public static void main(String args[])
    {
        int mat1[][]={{1,2},{3,4}};
        int mat2[][]={{6,7},{0,8}};
        
        if((mat1.length==mat2.length && mat1[0].length==mat2[0].length))
        {
            System.out.println("First matrix is ");
            for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat1[0].length;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            
            System.out.println("Second matrix is ");
            for(int i=0;i<mat2.length;i++)
            {
                for(int j=0;j<mat2[0].length;j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            
            int addmat[][]=new int[mat1.length][mat1[0].length];
            System.out.println("SUM MATRIX IS");
            for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat1[0].length;j++)
                {
                    addmat[i][j]=mat1[i][j]+mat2[i][j];
                    System.out.print(addmat[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Addition is not possible as order is mismatched.");
        }
    }
}
