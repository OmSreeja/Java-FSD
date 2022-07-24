
 public class Practice_Project17 {
	public static void main(String args[]) throws Exception{
	
		
		int a=10;
		int b=20;
		
		try {
		if(a<b) {
			throw new Exception();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block should be executed irrespective of exception");
		}
	}
 }

