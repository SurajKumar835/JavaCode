import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HelloToNew{
    public static void main(String [] args) throws Exception 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N=Integer.parseInt(line);
        for(int i=0;i<N;i++)
        {
            String input=br.readLine().trim();
            int s=0;
            int e=input.length()-1;
            while(input.charAt(s) == input.charAt(e))
            {
                s++;
                e--;
                if(s==input.length()/2)
                    break;
            }
            if(s!=input.length()/2)
            {
                if(input.charAt(s)!=input.charAt(e-1))
                {
                    System.out.println(s);
                }else
                {
                    System.out.println(e);
                }
            }else
                    System.out.println(-1);
            
        }
    }
}
