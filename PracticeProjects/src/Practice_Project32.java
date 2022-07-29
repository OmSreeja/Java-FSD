import java.util.*;
public class  Practice_Project32
{
    // function lis 
    public int lis(int[] a,int n)
    {    
    	int max=0;
    	int lis[]=new int[n];
    	lis[0]=1;
    	for(int i=1;i<n;i++) {
    		lis[i]=1;
    		for(int j=0;j<i;j++) {
    			if(a[i]>a[j]&&lis[i]<=lis[j]) {
    				lis[i]=lis[j]+1;
    			}
    		}
    	}
    	for(int i=0;i<n;i++) {
    		if(max<lis[i]) {
    			max=lis[i];
    		}
    	}
    	return max;
                   
    }
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Longest Increasing Subsequence Algorithm \n");
        System.out.println("Enter number of elements for sequence");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements");
        for (int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
        Practice_Project32 obj = new Practice_Project32(); 
        //int[] result = obj.lis(arr,n);       
        System.out.print("\nLongest Increasing Subsequence is : "+obj.lis(arr,n));
        //for (int i = 0; i < result.length; i++)
           // System.out.print(result[i] +" ");
        System.out.println();
    }
}