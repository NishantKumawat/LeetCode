//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    long solve(long N, long sum)
    {
        if(N==1)
        {
            return sum+1;
        }
        else{
            sum += N*N*N;
            N--;
            return solve(N,sum);
            
        }
        
    }
    
    long sumOfSeries(long N) {
        // code here
        return solve(N , 0);
    }
}