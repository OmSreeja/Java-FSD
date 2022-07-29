import java.lang.*;
public class Practice_Project9{
	public static void main(String args[])
	{
		//Creating a String
		String s=new String("Hello,Welcome to java");
		//implementing methods in java
		System.out.println("length of string s is :"+s.length());
		System.out.println("UpperCase of string s is :"+s.toUpperCase());
		String s1="Hello";
		
		String s2="Hello";
		//comapring of two strings s1 and s2
		System.out.println("string comparison :"+s1.compareTo(s2));
		//substring
		System.out.println("subtsring of s :"+s.substring(2));
		//equals
		System.out.println("string equals : "+s.equals(s1));
		//String Builder
		System.out.println("\n");
		System.out.println("String to StringBuilder");
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb);
		//String Buffer
				System.out.println("\n");
				System.out.println("String to StringBuffer");
				StringBuffer bf=new StringBuffer(s1);
				bf.append("Nice to meet you!");
				System.out.println(bf);
				
	}

}
