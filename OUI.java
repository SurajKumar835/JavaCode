import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String inA=br.readLine();
        String[] str=inA.split(" ");
         String f="";
        for(int i=0;i<N/2;i++)
        {
            f+=Integer.parseInt(Character.toString(str[i].charAt(0)));
        }
        String l="";
        for(int j=N/2;j<N;j++)
        {
             l+=Integer.parseInt(Character.toString(str[j].charAt(str[j].length()-1)));
        }
       // System.out.println(f+l);
        if(Integer.parseInt(f+l)%11==0)
            System.out.println("OUI");
        else
            System.out.println("NON");
    }
}
