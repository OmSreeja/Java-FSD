//abstarct class
	abstract class Display {
		abstract void dis();
	}
public class Practice_Project20 extends Display{
	//inheritance
	public void dis() {
			System.out.println("This is abstract method");
	}
	 //compile time polymorphism
     void area(double r) {
			System.out.println("area of square "+3.14*r*r);
		}
	void area(int b,int h) {
			System.out.println("area of triangle "+0.5*b*h);
		}
	
	public static void main(String args[]) {
		Practice_Project20 s=new Practice_Project20();
		s.area(2);
		s.area(2, 4);
		s.dis();
	}
	
}