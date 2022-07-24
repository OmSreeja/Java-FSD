
public class Practice_Project4 {
	int a,b;
	//method overloading
	public void add(int a,int b)
	{
		System.out.println("addition of two numbers are "+(a+b));
	}
	public void add(int a ,int b,int c)
	{
		System.out.println("addition of three numbers are "+(a+b+c));
	}
	//by returning a value in method
	public int mul(int c,int d)
	{
		int e=c*d;
		return e;
	}
	public static void main(String args[])
	{
		Practice_Project4 m=new Practice_Project4();
		m.add(2, 3);
		m.add(4, 5,6);
		System.out.println("multiplication of two numbers are "+(m.mul(2,4)));
	}

}
