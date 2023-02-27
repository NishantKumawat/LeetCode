//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printGfg(n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    void solve(int N)
    {
        if(N<1)
        return;
        else
        {
            System.out.print("GFG" + " ");
            solve(N-1);
        }
        
    }
    
    void printGfg(int N) {
        // code here
        solve(N);
    }
}