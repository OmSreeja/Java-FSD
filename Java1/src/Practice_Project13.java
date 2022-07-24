import java.util.*;
import java.lang.*;
public class Practice_Project13 extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Run Thread1");
		}
	}
	public static void main(String args[]) {
		Practice_Project13 t=new Practice_Project13();
		
		t.start();
		System.out.println("Main Thread");
	}
}
