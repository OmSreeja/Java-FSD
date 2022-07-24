import java.lang.*;
import java.util.*;
public  class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Runnable Thread");
		}
	}
    public static void main(String args[]) {
    	MyRunnable r= new MyRunnable();
    	Thread t=new Thread(r);
    	t.start();
    	System.out.println("Main Thread");
    }
}
