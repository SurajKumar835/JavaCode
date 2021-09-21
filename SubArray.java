import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
         // Write your code here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N=Integer.parseInt(br.readLine());
         String s=br.readLine().trim();
         int Q=Integer.parseInt(br.readLine());
         for(int i=0;i<Q;i++)
         {
             String lrt=br.readLine().trim();
             String[] lr=lrt.split(" ");
             int start=s.indexOf(lr[0]);
             int end=s.indexOf(lr[1]);
             String[] strA=s.split("");int sum=0;
             for(int j=start;j<=end;j++)
             {
                     sum +=Integer.parseInt(strA[j]);
             }
                 
             
             if(sum % 9 == 0)
                System.out.println("SAMEER");
             else
                System.out.println("NO");
         }
    }
}
