import java.util.*;
public class  Practice_Project32
{
    // function lis 
    public int[] lis(int[] a)
    {        
        int n = a.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
            for (int pos = L ; pos >= 1; pos--)
            {
                if (a[M[pos]] < a[i])
                {
                    j = pos;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || a[i] < a[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
 
        // backtrack 
        int[] result = new int[L];
        int pos = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = a[pos];
            pos = P[pos];
        }
        return result;             
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
        int[] result = obj.lis(arr);       
        System.out.print("\nLongest Increasing Subsequence is : ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    }
}