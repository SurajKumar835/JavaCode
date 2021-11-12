import java.util.*;
import java.math.*;
public class TestClass{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        while(T-- !=0)
        {
            BigInteger a=in.nextBigInteger();
            int b=in.nextInt();
            String s="";
            s=a.pow(b).toString();
            s=String.format("%6s", s).replace(' ', '0');
            System.out.println(s.substring(s.length()-6));
        }
    }
}
