import java.lang.*;
public class A{
    public static void main(String[] args)
    {
        try{
             int n=100;int x=1;
             int[] arr =new int[n];
             for(int i=0;i<=n;i++)
             {
                 arr[i]=i/x;
             }
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Array out of bound");
            //System.exit(0);
        }
        catch(ArithmeticException exception)
        {
            System.out.println("Divide by zero error");
        }
        catch(Exception exception)
        {
            System.out.println("Error2");
        }
        finally
        {
            
            System.out.println("Cool man!! testing on Exception handling");
        }
    }
}
