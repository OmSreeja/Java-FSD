public class Practice_Project18 {
	public static void main(String args[]) throws Exception{
	
		
		int a=10;
		int b=0;
		
		try {
		if(a>b) {
			throw new Exception();
		}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block should be executed irrespective of exception");
		}
	}
 }


