import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
         // Write your code here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N=Integer.parseInt(br.readLine());
         String s=br.readLine().trim();
         int Q=Integer.parseInt(br.readLine());
          String[] strA=s.split("");int[] sum=new int[100005];
             for(int j=0;j<strA.length;j++)
             {
                     sum[j+1] = sum[j]+Integer.parseInt(strA[j]);
             }
                 
         for(int i=0;i<Q;i++)
         {
             String lrt=br.readLine().trim();
             String[] lr=lrt.split(" ");
             int start=Integer.parseInt(lr[0]);
             int end=Integer.parseInt(lr[1]);
             if((sum[end]-sum[start-1]) % 9 == 0)
                System.out.println("SAMEER");
             else
                System.out.println("NO");
         }
    }
}
