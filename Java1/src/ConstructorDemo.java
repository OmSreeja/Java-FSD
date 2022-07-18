
public class ConstructorDemo {
	String a, b;
	ConstructorDemo()
	{
		System.out.println("No arguments Constructor");
	}
	ConstructorDemo(String a,String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c1=new ConstructorDemo("hii","how are u?");
	}

}
