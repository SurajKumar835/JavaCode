import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String inA=br.readLine();
        char t=inA.charAt(inA.length()-1);
        String tR=Character.toString(t);
       if(Integer.parseInt(tR)%10==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
