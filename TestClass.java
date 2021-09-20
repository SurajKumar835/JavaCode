public class MyClass {
    public static void main(String args[]) {
      
      add(0,0);
    }
      static void add(int index,int start){
          System.out.println(index+":"+start+"*-----------");
      for(int i=start;i<3;i++)
      {
         System.out.println(i+":"+start);
            add(i,start+1);
      }

      }
    
}
