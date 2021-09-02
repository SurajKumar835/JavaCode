import java.lang.*;
import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     //code for checking palindrome
      Scanner in = new Scanner(System.in);
      String s=in.nextLine();
      
      StringBuffer sb = new StringBuffer(s);
      sb.reverse();
      String s1=sb.toString();
      if(s.equals(s1)){
       System.out.print("It's a Palindrome");}
      else{
        System.out.print("It's not a Palindrome");} 
    }
}
