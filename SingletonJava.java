//Create Singleton Class
public class SingletonJava{
    public static void main(String [] args)
    {
    
        A x=A.getInstance();
        A y=A.getInstance();
         System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
    }
}
class A
{
     static A string=null;
    private A(){
       System.out.print("hello Iam Here !"); 
    }
    public static A getInstance(){
        if(string ==null)
            string=new A();
        return string;
    }
}
