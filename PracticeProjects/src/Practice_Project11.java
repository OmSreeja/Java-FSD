import java.util.regex.*;
public class Practice_Project11 {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Welcome to Java Programming";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
	}



