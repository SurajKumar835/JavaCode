public class Hello{
    public static void main(String[] args)
    {
        int[] arr={-2,-2,3,-1,2,-1};int max=0;
        int maxf=arr[0];
        int start=0;int end=arr.length;
        
             
            for(int i=0;i<arr.length;i++)
            {
                max+=arr[i];
                if(max<0)
                {
                    max=0;
                }
                else if(maxf<max)
                {
                    maxf=max;
                }
            
        }
        System.out.print(maxf);
    }
}
