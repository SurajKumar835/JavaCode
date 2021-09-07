import java.util.*;
public class Hello{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ins=in.nextLine();
        String s=ins.substring(1,ins.length()-1);
        String[] a=s.split(",");int i=0,j=0,c=0;
        String[] str=new String[a.length];
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(Integer.parseInt(a[j])>Integer.parseInt(a[i]))
                {
                    str[c]=(a[i]+":"+a[j]);c++;
                    a[i]="0";
                    break;
                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(Integer.parseInt(a[i])!=0)
            {
                str[c]=(a[i]+":"+"-1");c++;
            }
        }
        int iMax=str.length-1;
        System.out.print("[");
            for(i=0;i<str.length;i++)
            {
                System.out.print("{"+str[i]+"}");
                if(i!=iMax)System.out.print(",");
            }
        System.out.print("]");
    }
}
