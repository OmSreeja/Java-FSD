
public class Practice_Project16 {
	public static void main(String args[]) {
		int a=10;
		int b=0;
		//using try catch if exception araises then catch block will handle
		try {
			int res=a/b;
			System.out.println("Result is"+res);
		}
		//exception araises so catch block will execute
		catch(Exception e) {
			System.out.println("Exception araises"+e.getMessage());
		}
		System.out.println("Bye");
	}
	
}
