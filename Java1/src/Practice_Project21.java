
interface Interface1  
{  
   public default void display()   
	{  
	   System.out.println("the display() method of Interface1 invoked");  
	}  
}  
interface Interface2  
	{  
	public default void display()   
	{  
	   System.out.println("the display() method of Interface2 invoked");  
	}  
}  
public class Practice_Project21 implements Interface1, Interface2  
{  
	public void display()   
	{  
	   Interface1.super.display();  
	   Interface2.super.display();  
	}  
	public static void main(String args[])   
	{  
	   Practice_Project21 obj = new Practice_Project21();  
	   obj.display();  
	}  
} 

