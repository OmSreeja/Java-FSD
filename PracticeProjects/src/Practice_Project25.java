import java.util.*;
public class Practice_Project25 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of an array");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	 int sum=0;
	 System.out.println("Enter the left index");
	 int l=sc.nextInt();
	 System.out.println("Enter the right index");
	 int r=sc.nextInt();
	 if(l<=r && r<=n-1) {
		 for(int i=l;i<=r;i++) {
			 sum=sum+a[i];
		 }
	 }
	 System.out.println(sum);
 }
}
