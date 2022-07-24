
public class Practice_Project5 {
	String a, b;
	Practice_Project5()
	{
		System.out.println("No arguments Constructor");
	}
	Practice_Project5(String a,String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		Practice_Project5 c=new Practice_Project5();
		Practice_Project5 c1=new Practice_Project5("hii","how are u?");
	}

}
