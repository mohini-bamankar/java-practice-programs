
package set_79;

import java.util.Scanner;

public class Set_79_3 {
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        int mat[][]={{10,20,30},{40,50,60},{70,80,90}};
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
