//import for Scanner and other utility classes
import java.util.*;

public class Tprimes {
    public static void main(String args[] ) throws Exception    {
        // Write your code here
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(); 
        while(in.hasNext())
        {
            long n=in.nextLong();
            double n1=Math.sqrt(n);
            int count=1;
            if(n1*n1==n)
            {
                 for(int i=1;i<=n1;i++)
                 {
                    if(n1%i==0)
                    {
                    
                        ++count;
                        if(count>3)
                        {
                            break;
                        }
                    }
                
                }
                if(count == 3)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                
                }
                else{
                    System.out.println("NO");
                }
        
        }
    }
}
