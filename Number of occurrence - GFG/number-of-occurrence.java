//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count = 0;
        
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (low + high)/2;
            // System.out.println("MID 1 : " + mid);
            if(arr[mid] == x){
                // if( (mid + 1) <= high  && arr[mid+1]  )
                count++;
                int index1 = mid-1;
                int index2 = mid+1;
                while(index1>=0 && arr[index1] == x){
                    count ++;
                    index1--;
                }
                while(index2 <= high && arr[index2] == x){
                    count++;
                    index2++;
                }
                return count;
            } else if(arr[mid] > x){
                high = mid - 1;
            } else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        
        return 0;
    }
}