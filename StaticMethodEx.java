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
