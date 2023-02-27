//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        ArrayList<Integer> arr = new ArrayList<>(); 
        if(N == 1)
        {
            return 1;
        }
        else
        {
            int distinct_Pointer = A[0];
            arr.add(distinct_Pointer);
            // System.out.print(distinct_Pointer + " ");
            for(int i=1;i<N;i++)
            {
                if(A[i] != distinct_Pointer)
                {
                    
                    distinct_Pointer = A[i];
                    
                    arr.add(distinct_Pointer);
                }
            }
            for(int i = 0 ;i<arr.size();i++)
            {
                A[i]= arr.get(i);
            }
            return arr.size();
        }
    }
}