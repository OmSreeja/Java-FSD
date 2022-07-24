
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Pratice_Project19 {
	public static void main(String args[]) throws IOException
	{
		File myFile=new File("myfile.txt");
		//creating a new file
	    boolean f=myFile.createNewFile();
		if(f) {
			System.out.println("File Created successfully");
		}
		else {
			System.out.println("File Created error");
		}
		//writing some content to a file
		String data="100,sreeja is a student";
		FileWriter output=new FileWriter("myfile.txt");
		output.write(data);
		System.out.println("\n");
	    System.out.println("content written");
		output.close();
		//Reading data from a file
		char[] d=new char[100];
		FileReader input=new FileReader("myfile.txt");
		input.read(d);
		System.out.println("\n");
		System.out.println("data received from a file are");
		System.out.println(d);
		input.close();
		
		//appending data to a file
		String d1="    The new appended data is sreeja is a professor";
		FileWriter o1=new FileWriter("myfile.txt",true);
		System.out.println("\n");
		o1.write(d1);

		System.out.println("data append successfully");
		o1.close();
		File myf=new File("newfile.txt");
		if(myf.delete()) {
			System.out.println("file deleted successfully");
		}
		else {
			System.out.println("file deletion error");
		}
	}

}
