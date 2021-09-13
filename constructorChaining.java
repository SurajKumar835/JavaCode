//example of constructor Chaining
public class A
{
    A()
    {
        this("hi Suraj Back Man");
    }
    A(String s)
    {
        System.out.print(s);
    }
    public static void main(String [] args)
    {
        A ib=new A();
    }
}
