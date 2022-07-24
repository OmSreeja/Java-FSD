package accessmodifiersabc;

import accessmodifiers.*;

public class Xyz extends Modifiers {
	public static void main(String args[]) {
		Xyz M=new Xyz();
		//System.out.println("private modifier:"+ M.a); cant be access private modifier
		System.out.println("public modifier:"+ M.c);
		//System.out.println("Default modifier:"+ M.d);outside package defalut cant access
		System.out.println("Protected modifier:"+ M.b);
}
}
