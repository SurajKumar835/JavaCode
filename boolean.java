import java.util.*;
public class Hello
{
    public static void main(String [] args)
    {
        Boolean b1=new Boolean(true);
         Boolean b2=new Boolean(true);
         boolean b3=true;
         Boolean b4=true;
         //== compare object reference not true in this case 
         System.out.print(b1==b2);
         //compare value 
         System.out.print(b1==b3);
            System.out.print(b3==b4);
    }
}
////other code
public class MyClass {
    public static void main(String args[]) {
       int i=10;
       method(i);
    }
     static void method(long l)
    {
        System.out.print(l);
    }
}
