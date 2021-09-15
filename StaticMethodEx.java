//Java Exmaple of Static Variable
public class Hello
{
    static String hello="suraj";
    static int count=0;
        Hello(){
            count++;
            System.out.println(hello+":"+count);
        }
    public static void main(String[] args)
    {
        
        Hello a=new Hello();
        Hello b=new Hello();
        Hello c=new Hello();
        System.out.println(hello+"-"+count);
    }
}
////////////////////////////////
public class StaticMethod
{
    static void myself(){
        System.out.print("iam Coming ! Suraj");
    }
    public static void main(String [] args)
    {
        myself();
    }
}
/////////////////////////////////
public class StaticBlock
{
    static int a;
    static int b;
    static int c;
    static {//static block to intialize data member
            a=12;
            b=19;
            c=a+b;
        System.out.println("iam Coming ! Suraj");
    }
    StaticBlock(){
         System.out.println("hello"+ c);
    }
    public static void main(String [] args)
    {
        StaticBlock at=new StaticBlock();
        System.out.println(c);
       
    }
}
