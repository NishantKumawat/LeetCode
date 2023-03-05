//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    int solve(String S, int start, int end)
    {
        if(S.charAt(start) != S.charAt(end))
        {
            return 0;
        }
        else
        {
            if(start>end)
            {
                return 1;
            }
            else
            {
                return solve(S,++start,--end);
            }
        }
    }
    
    int isPalindrome(String S) {
        // code here
        if(S.length() == 1)
        return 1;
        else
        return solve(S,0,S.length()-1);
    }
};