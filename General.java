public class Hello
{
    public static void main(String [] args)
    {
      // Ascii code of b and i sum get printed
        System.out.print('b'+'i');
    }
}
///////////////////////
//Java Example of instance Variable
public class Hello
{
    static String hello="suraj";
    int count=0;//instance variable not retain value
        Hello(){
            count++;
            System.out.println(hello+":"+count);
        }
    public static void main(String[] args)
    {
       // int count=2;
        Hello a=new Hello();
        Hello b=new Hello();
        Hello c=new Hello();
        System.out.println(hello+"-"+c.count);
    }
}
///////////////////////////////
