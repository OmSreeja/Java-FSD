import java.util.*;
public class Practice_Project12 {
	public static void main(String args[])
		{
			String s,searchmail;
			int b;
			ArrayList<String> a1 = new ArrayList<String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of email ids :");
			//num of mial ids
			b=sc.nextInt();
			//giving input
			System.out.println("Enter the email Ids :");
			for(int i=1;i<=b;i++)
			{
				s=sc.next();
				a1.add(s);
			}
			System.out.println(a1);
			//searching email ids
			System.out.println("Enter the email Id that to be searched whether it is valid or not");
			searchmail=sc.next();
			if(a1.contains(searchmail))
			{
				System.out.println("Valid Email ID");
			}
			else
			{
				System.out.println("Invalid Email ID");
			}
		}
	}
