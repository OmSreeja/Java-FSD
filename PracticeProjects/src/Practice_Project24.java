import java.util.*;
public class Practice_Project24 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the length of array");
	 int n=sc.nextInt();
	 int t;
	 int a[]=new int[n];
	 //input to an array
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++) {
		 for(int j=1;j<n;j++) {
			 if(a[j]>a[i]) {
				 t=a[i];
				 a[i]=a[j];
				 a[j]=t;
			 }
		 }
	 }
	 //printing 4th smallest number
	 System.out.println(a[4]);
 }
}
