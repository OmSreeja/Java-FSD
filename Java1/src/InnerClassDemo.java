import java.io.*;
class OuterDemo {
	
		   // private variable of the outer class
		   private String name = "Sree";  
		   
		   // inner class
		   public class Inner_Demo {
		      public String getName() {
		         System.out.println("getName method of inner class");
		         return name;
		      }
		   }
}
public class InnerClassDemo{
public static void main(String args[]) {
		      // Instantiating the outer class
		 OuterDemo outer = new OuterDemo();
		      
		      // Instantiating the inner class
		      OuterDemo.Inner_Demo inner = outer.new Inner_Demo();
		      System.out.println(inner.getName());
		   }
}


