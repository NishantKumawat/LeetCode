//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
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
                System.out.print("* ");
                p=p-2;
            }
            stars+=2;
            System.out.println();
        }
        
        stars = n+(n-1);
        
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
                System.out.print("* ");
                starsCpy-=2;
            }
            
            stars -=2;
            System.out.println();
            
        }
    }
}
