import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class TestClass
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int i=0,j=0;
        for(j=0;j<T;j++)
        {
            int N=Integer.parseInt(br.readLine());
            String s=br.readLine();
            
            int[] n=new int[N];
            String[] strA=s.split(" ");
            for(i=0;i<strA.length;i++)
            {
                n[i]=Integer.parseInt(strA[i]);
            }
            createHashMap(n);
        }
    }
    static void createHashMap(int arr[])
    {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            Integer c=hmap.get(arr[i]%10);
            if(hmap.get(arr[i]%10)==null)
                hmap.put(arr[i]%10,1);
            else
                hmap.put(arr[i]%10,++c);
        }
        int count=0;
         for (Map.Entry mapElement : hmap.entrySet()) {
            int value = ((int)mapElement.getValue());
            count+=value-1;}
            System.out.println(count);
    }
}
