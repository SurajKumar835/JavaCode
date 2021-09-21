import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
         // Write your code here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N=Integer.parseInt(br.readLine());
         String s=br.readLine().trim(); 
         int Q=Integer.parseInt(br.readLine());
         char[] data=s.toCharArray();
         int len=data.length;
         int[] sum=new int[100005];
           for(int i=0;i<len;i++)
            {
                sum[i+1]=sum[i]+data[i]-48;
            }
         for(int i=0;i<Q;i++)
         {
             String lrt=br.readLine();
             String[] lr=lrt.split(" ");
             int start=Integer.parseInt(lr[0]);
             int end=Integer.parseInt(lr[1]);
             int diff=sum[end]-sum[start-1];
             if(diff%9==0)
                System.out.println("SAMEER");
             else
                System.out.println("NO");
                
         }
    }
}
