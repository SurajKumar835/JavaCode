import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
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
    int sumf=0;int a=0;
       int n=inpAr.length;
         for (int i = 0; i < n; i++) {
             sumf += Integer.parseInt(inpAr[i]);
             if (sumf - x ==0 || sumf-x>0)
                {
                    count++;
                
                }
                if(count>0){a++;}
        }
    
    System.out.println(a);
}
    
}
