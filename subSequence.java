import java.util.*;
import java.lang.Math;
public class TestClass {
    public static void main(String args[]) throws Exception {
      Scanner in =new Scanner(System.in);
      int T=in.nextInt();
        for(int i=0;i<T;i++)
        {
            int lenStr=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            char[] ch=s.toCharArray();
            
               int [] fr = new int [s.length()];  
                int visited = -1;  
            for(int j=0;j<ch.length;j++)
            {
                int count=1;
                for(int k=j+1;k<ch.length;k++)
                {
                    if(ch[j]==ch[k])
                    {
                        count++;
                          fr[k] = visited;  
                    }
                }
                 if(fr[j] != visited)  
                    fr[j] = count;  
            }
            int sum=0;
             for(int k = 0; k < fr.length; k++){  
                if(fr[k] != visited) { 
                //System.out.println("    " + ch[k] + "    |    " + fr[k]);  
                sum+=Math.pow(2, fr[k])-1;}
        }
                System.out.println(sum);
        }
    }
}
