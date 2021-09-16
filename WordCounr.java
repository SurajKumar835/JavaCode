import java.util.*;
public class WordCount
{
    public static void main(String[] args)
    {
        String st="Hello World Welcome to Simplilearn World word";
        String str=st.toLowerCase();
        String[] arry=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<arry.length;i++)
        {
            int count=1;
            if(hm.containsKey(arry[i]))
            {
                //int count=hm.get(arry[i]);
                hm.put(arry[i],++count);
            }else
            {
                hm.put(arry[i],count);
            }
        }
        System.out.println(hm);
    }
}
