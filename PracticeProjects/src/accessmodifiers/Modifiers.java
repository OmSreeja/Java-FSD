package accessmodifiers;

public class Modifiers {
	private int a=10; //access within same class
	public int c=20; //access anywhere
	int d=30; //access within same pacakage
	protected int b=40;//access within different package but is should extends
	public static void main(String args[]) {
		Modifiers M=new Modifiers();
		System.out.println("private modifier:"+ M.a);
		System.out.println("public modifier:"+ M.c);
		System.out.println("Default modifier:"+ M.d);
		System.out.println("Protected modifier:"+ M.b);
	}
	
}
