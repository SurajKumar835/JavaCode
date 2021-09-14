22, Ravi Pawar, Aundh, 1603
23, Suvarna Kale, Baner, 803
27, Vinod Chavan, Aundh, 809
29, Vasant Mahajan, Aundh, 617
32, Aarti Patil, Baner, 351
34, Swaran Bijur, Baner, 352


// full code i did myself be proud confident
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processArray(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
         //29, Vasant Mahajan, Aundh, 617
            int i=0;
            int count=0;
            HashMap<String,Integer> retVal = new HashMap<String,Integer>();
            String[] a=new String[array.size()];
            String[] c=new String[array.size()*3];
                for(i=0;i<array.size();i++)
                {
                    a[i]=array.get(i);
                }
                for(i=0;i<a.length;i++)
                {
                    String[] b=a[i].split(",");
                    c[count]=b[0];c[++count]=b[2];c[++count]=b[3];
                    count++;
                }

                int f=0;int g=0;
                int j=1;int[] h=new int[array.size()];int[] k=new int[array.size()];
                      for(i=0;i<c.length;i++)
                        {
                           if(c[i].equals(c[1]))
                           {
                               h[f]=i-1;
                               f++;
                           }else if(c[i].equals(c[4]))
                           {
                               k[g]=i-1;
                               g++;
                           }
                        }
                        int max1=Integer.parseInt(c[k[0]]);int index1=0,index2=0;
                     for(i=0;i<g;i++)
                    {
                        if(Integer.parseInt(c[k[i]])>max1)
                            max1=Integer.parseInt(c[k[i]]);
                            index1=k[i];
                    }
                   // System.out.print(index1);
                     int max2=Integer.parseInt(c[h[0]]);
                     for(i=0;i<f;i++)
                    {
                        if(Integer.parseInt(c[h[i]])>max2)
                            max2=Integer.parseInt(c[h[i]]);
                            index2=h[i];
                    }
                  // System.out.print(c[index2+2]);
                        retVal.put(c[index2+1],Integer.parseInt(c[index2+2].trim()));
                        retVal.put(c[index1+1],Integer.parseInt(c[index1+2].trim()));
                         // Displaying the HashMap
                       // System.out.println("Initial Mappings are: " + retVal);
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processArray(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
