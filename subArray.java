import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String Q=br.readLine().trim();    
    String inpArray=br.readLine();
    String[] aQ=Q.split(" ");
    String[] inpAr=inpArray.split(" ");
    int x=Integer.parseInt(aQ[1]);
    int count=0;
    for(int i=0;i<inpAr.length;i++)
    {
        int sum=0;
        for(int j=i;j<inpAr.length;j++)
        {
          sum+=Integer.parseInt(inpAr[j]);
          if(sum==x)
          {
              count++;
          }
    }
        
    }
    System.out.println(count);
    }
}
