import java.util.*;
public class ArithmeticCalculator {
    public static void main(String args[])
    {
  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("choose the option");
    	System.out.println("+ :Addition\n- :Substraction\n* :Multiplication\n/ :Division");
    	char c=sc.next().charAt(0);
    	System.out.println("Enter two numbers for calculation");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	//Explicit Type Casting
    	double num1=(double)a;
    	double num2=(double)b;
        switch(c)
        {
        	  case '+' : System.out.println(num1+num2);
        	             break;
        	  case '-' : System.out.println(num1-num2);
              			 break;
        	  case '*' : System.out.println(num1*num2);
    			         break;
        	  case '/' : System.out.println(num1/num2);
    	                 break;
    	      default  : System.out.println("Please Enter valid option");
    	                 break;
        }
    }
}
