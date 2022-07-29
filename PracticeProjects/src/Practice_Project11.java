import java.util.regex.*;
public class Practice_Project11 {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "java";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		System.out.println( "string matches the given regex "+c.matches() );
		}
	}



