import java.util.*;
public class Practice_Project23 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
		}
	 int k=5;
	 int res[]=new int[n];
	 for(int i=0;i<5;i++) {
		 res[i]=a[n-k+i];
	 }
	 int j=0;
	 for(int i=k;i<n;i++)
	 {
		res[i]=a[j];
		j++;
	 }
	 for(int i=0;i<n;i++) {
		 System.out.println(res[i]);
	 }
 }
}
