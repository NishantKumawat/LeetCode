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
        int ascii=65+n-1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.println((char)ascii);
                }
                else{
                    System.out.print((char)ascii-- + " ");
                }
            }
            ascii=65+n-1;
        }
    }
}