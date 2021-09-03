import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in =new Scanner(System.in);
      int T=in.nextInt();
        for(int i=0;i<T;i++)
        {
            int lenStr=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            char[] ch=s.toCharArray();
            int count=0;
            for(int j=0;j<ch.length;j++)
            {
                for(int k=j+1;k<ch.length;k++)
                {
                    if(ch[j]==ch[k])
                    {
                        count++;
                    }
                }
            }
            System.out.println(lenStr+count);
        }
    }
}
