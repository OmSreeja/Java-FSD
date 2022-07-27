import java.util.*;
public class Practice_Project33 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("element the number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("element the array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("element the searching element");
		int s=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++) {
			if(a[i]==s) {
				f=1;
			    break;
			}
		}
		if(f==1) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		
		}
	}

}
