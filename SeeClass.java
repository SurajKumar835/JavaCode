public class SeeClass {
    public static void main(String args[]) {
    int [] c={1,2,1,2,1};
    int[] b={0,2,4};int sum=0;int check=0;
    for(int i=0;i<b.length;i++)
    {
        if (b[i]==0)
            check=0;
        else 
            check=1;
    }
    if(check==0)
    {
        for(int j=0;j<c.length-1;j++)
        {
            sum +=c[j];
        }
    }else{
          for(int i=0;i<b.length;i++)
            {
                sum+=c[b[i]];
            }
    }
    System.out.println(sum);
   
    }

}
