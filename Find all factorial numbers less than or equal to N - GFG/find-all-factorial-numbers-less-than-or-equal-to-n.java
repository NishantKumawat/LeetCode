//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static ArrayList<Long> solve(long currentNumber, long factorialSum, long N, ArrayList<Long> aList)
    {
        if(factorialSum>N)
        {
            return aList;
        }
        else
        {
            aList.add(factorialSum);
            return solve(++currentNumber , factorialSum * currentNumber, N , aList);
        }
    }
    
    
    static ArrayList<Long> factorialNumbers(long N){
        
        ArrayList<Long> aList = new ArrayList<Long>();
        return solve(1,1,N,aList);
    }
}