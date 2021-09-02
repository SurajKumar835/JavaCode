public class MyClass {
    public static void main(String args[]) {
      String a="one";
      String b="two";
      a=a+b;
      b=a.substring(0,a.length()-b.length());
      a=a.substring(b.length(),a.length());
      System.out.print(a);System.out.print(" ");
      System.out.print(b);
    }
}
