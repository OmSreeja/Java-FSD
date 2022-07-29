import java.util.*;
public class Practice_Project38 {  
    public static int[] insertionSort(int array[]) { 
    	int n = array.length;  
    	for(int i=1;i<n;i++) {
    		int j=i;
    		while((j>0)&&(array[j-1]>array[j])) {
    			int temp=array[j];
    		    array[j]=array[j-1];
    		    array[j-1]=temp;
    		    j--;
    		}
    			    		    
    	}
    	return array;
        
    }  
       
    public static void main(String a[]){    
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the size");
    	int n=sc.nextInt();
    	int array[]=new int[n]; 
    	System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
        	array[i]=sc.nextInt();
        }   
        System.out.println("Before Insertion Sort");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        array=insertionSort(array);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort"+Arrays.toString(array));    
        //for(int i:arr1){    
          //  System.out.print(i+" ");    
        }//    
    }    
   
