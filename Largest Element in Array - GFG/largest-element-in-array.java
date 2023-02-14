//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    
    static int solve(int n, int[] arr){
        int largest_Number = 0;
        
        for(int i = 0;i<n;i++)
        {
            if(arr[i] > largest_Number)
            {
                largest_Number = arr[i];
            }
        }
        return largest_Number;
    }
    
    public int largest(int arr[], int n)
    {
        // get the start time
        // long start = System.nanoTime();

        // call the method
        

        // get the end time
        // long end = System.nanoTime();

        // execution time
        // long execution = end - start;
        // double elapsedTimeInSecond = (double) execution / 1_000_000_000;

        // System.out.println(elapsedTimeInSecond + " seconds");
        
        return solve(n,arr);
    }
}