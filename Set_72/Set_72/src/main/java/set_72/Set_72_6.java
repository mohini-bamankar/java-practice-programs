
package set_72;

public class Set_72_6 {
    public static void main(String args[])
    {
        int n=15,num=2,count=1,itr=0;
        
        while(count<=n)
        {
            boolean flag=true;
            for(int i=2;i<num;i++)
            {
                itr++;
                if(num%i==0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
            {
                System.out.print(num+",");
                count++;
            }
            num++;
        }
    }
}
