//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int ans=0;
        if(N==1)
        {
            return A[0];
        }
        for(int i = 0;i < N-1;i++)
        {
            if(A[i] == A[i+1]){
                i=i+1;
            }
            else
            {
                ans=A[i];
                break;
            }
        }
        if(A[N-1] != A[N-2])
        {
            return A[N-1];
        }
        return ans;
    }
}