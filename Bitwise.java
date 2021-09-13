/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
            int T=Integer.parseInt(br.readLine());
            
            int i=0,j=0;
            for(i=0;i<T;i++)
            {
                    int N=Integer.parseInt(br.readLine());
                    String arrayInput=br.readLine();
                    String[] aInp=arrayInput.split(" ");
                    int sum=0;
                    for(j=0;j<aInp.length;j++)
                    {
                            sum^=Integer.parseInt(aInp[j]);
                    }
                    System.out.println(sum);
            }
    }
}
