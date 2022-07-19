import java.util.*;
public class ArrayPracticeProgram {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of elements");
    	int n=sc.nextInt();
    	//Declaring an array
    	int[] arr=new int[n];
    	System.out.println("Input elements to the array");
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.println("Array elements are :"+arr[i]);
    	}
    }
}
