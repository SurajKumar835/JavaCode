import java.util.*;
public class NextHigh
{
    public static void main(String[] args)
    {
       int[] arr={1,2,3,4,5,2,1,1,8};
       int h=0;int sh=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>h)
           {
               sh=h;
               h=arr[i];
           }
           else if(arr[i]>sh)
           {
               sh=arr[i];
           }
       }
       System.out.println("High:" + h);
       System.out.println("second:"+ sh);
    }
}
