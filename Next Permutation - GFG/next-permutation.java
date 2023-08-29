//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int breakIndex = -1;
        List<Integer> ans = new ArrayList<>();
        
        //If array consists only 1 element
        if(N == 1){
            ans.add(1);
            return ans;
        }
        
        for(int i = N-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                breakIndex = i;
                break;
            }
        }
        
        // System.out.println("breakIndex : " + breakIndex );
        if(breakIndex == -1){
            int low = 0;
            int high = N;
            while(low<high){
                int temp = arr[low];
                arr[low] = arr[high-1];
                arr[high-1] = temp;
                
                low ++;
                high--;
            }
        } else{
            for(int i = N-1; i>breakIndex; i--){
                if(arr[i] > arr[breakIndex]){
                    int temp = arr[breakIndex];
                    arr[breakIndex] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            
            int low = breakIndex + 1;
            int high = N;
            while( low < high ){
                int temp = arr[low];
                arr[low] = arr[high-1];
                arr[high-1] = temp;
                
                low ++;
                high--;
            } 
        }
        
        for(int i = 0;i<N;i++){
            ans.add(arr[i]);
        }
        // ans.add(1);
        // ans.add(1);
        // ans.add(1);
        // ans.add(1);
        // ans.add(1);
        // ans.add(1);
        
        return ans;
    }
}