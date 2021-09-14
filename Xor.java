import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());
            String in=br.readLine();
            int Q=Integer.parseInt(br.readLine());
            String[] inp=in.split(" ");
        int i=0,j=0; 
        for(i=0;i<Q;i++)
        { 
            int sum=0,l=0;int[] inAr=new int[inp.length];
            String query=br.readLine(); 
            String[] aQ=query.split(" ");
            int start=Integer.parseInt(aQ[0]);
            int end=Integer.parseInt(aQ[1]);
            for(j=0;j<inp.length;j++)
            {
                inAr[j]=Integer.parseInt(inp[j]);
            }
            for(l=start;l<=end;l++)
            {
                sum^=inAr[l];
            }
            System.out.println(sum);
        }
    }
}
