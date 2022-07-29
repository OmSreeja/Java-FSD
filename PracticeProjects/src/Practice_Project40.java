import java.util.*;
class Practice_Project40
{
    
    void partition(int arr[], int low, int high)
    {
    	int mid=low+(high-low)/2;
    	int pivot=arr[mid];
    	int i=low;
    	int j=high;
    	while(i<=j) {
    		while(arr[i]<pivot)
    			i++;
    		while(arr[j]>pivot)
    			j--;
    		if(i<=j) {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			i++;
    			j--;
    		}
    	}
    	if(low<j) {
    		partition(arr,low,j);	
    	}
    		
    	if(i>high) {
    		partition(arr,i,high);
    	}
    }
    		
            // Driver program
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the size");
    	int n=sc.nextInt();
    	int arr[]=new int[n]; 
    	System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }

 
        Practice_Project40 ob = new Practice_Project40();
        ob.partition(arr, 0, n-1);
        System.out.println("sorted array");
       for(int i=0;i<n;i++) {
    	   System.out.println(arr[i] +"\t");
       }
        //System.out.println("sorted array"+arr);
       
    }
}