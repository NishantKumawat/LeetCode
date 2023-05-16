//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int A[], int N, int X)
    {
        // code here
        int diff = Integer.MAX_VALUE;
        int num = 0;
        Arrays.sort(A);
        for(int i=0;i<N-2;i++){
            int j = i + 1,k=N-1;
            while(j < k){
                    int sum = A[i] + A[j] + A[k];
                    if(sum == X){
                        return sum;
                    } else if(sum<X){
                        j++;
                    } else{
                        k--;
                    }
                    // System.out.println("i : " + i + " " + "j : " + j + " " + "k : " + k + " ");
                    // System.out.println(sum);
                    if(Math.abs(X-sum) < diff){
                        diff = Math.abs(X-sum);
                        num = sum;
                    }
            }
        }
        return num;
    }
}