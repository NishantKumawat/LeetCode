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
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int stars = 1;
        for(int i=1;i<=n;i++){
            int p = stars;
            int j = n-i;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }
            while(p>0)
            {
                System.out.print("*");
                p--;
            }
            stars+=2;
            System.out.println();
        }
    }
}