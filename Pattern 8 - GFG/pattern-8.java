//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int stars = n+(n-1);
        
        for(int i = 1;i<=n;i++)
        {
            int space = i-1;
            int starsCpy = stars;
            while(space>0)
            {
                System.out.print(" ");
                space--;
            }
            while(starsCpy>0)
            {
                System.out.print("*");
                starsCpy--;
            }
            
            stars -=2;
            System.out.println();
            
        }
    }
}