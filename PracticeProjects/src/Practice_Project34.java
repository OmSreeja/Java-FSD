import java.util.*;
public class Practice_Project34 {
	int binaryele(int a[],int l,int r,int s) {
		if(r>=l) {
		int m=(l+(r-1))/2;
		if(a[m]==s) {
			return m;
			}
		if (a[m] > s)
            return binaryele(a, l, m-1, s);
		return binaryele(a, m+1, r, s);
	}
		return -1;
	}
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("element the number of elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("element the array elements");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int l=0,r=n;
    System.out.println("element the searcch element");
	int s=sc.nextInt();
	Practice_Project34 p=new Practice_Project34();
	int r1=p.binaryele(a,l,r,s);
	if(r1==-1) {
		System.out.println("element not found");
	}
	else {
		System.out.println("element found");
	}
}
}
