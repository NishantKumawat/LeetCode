//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here 
        
        //Brute force approach       Time - O(n^2)  space - O(1)
        
        // for(int i = 0;i<n-1;i++)
        // {
        //     if(arr[i] == 0)
        //     {
        //         for(int j = i+1;j<n;j++)
        //         {
        //             if(arr[j]!=0)
        //             {
        //                 int temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //                 break;
        //             }
        //         }
        //     }
        // }
        
        //optimised solution         Time - O(n)   Space - O(n)
        
        // int[] num_arr = new int[n];
        // int j=0;
        // for(int i = 0;i<n;i++)
        // {
        //     if(arr[i] != 0){
        //         num_arr[j++] = arr[i];
        //     }
        // }
        // for(int i = num_arr.length;i<n;i++)
        // {
        //     num_arr[i] = 0;
        // }
        // for(int i = 0;i<n;i++)
        // {
        //     arr[i] = num_arr[i];
        // }
        
        //optimised solution         Time - O(n)   Space - O(1)
        int k = 0;
        
        while(k<n)
        {
            if(arr[k] == 0)
            {
                break;
            }
            else
            {
                k++;
            }
        }
        int zIndex = k;
        int numIndex = zIndex+1;
        while(zIndex < n && numIndex < n)
        {
            if(arr[numIndex] != 0)
            {
                int temp = arr[zIndex];
                arr[zIndex] = arr[numIndex];
                arr[numIndex] = temp;
                zIndex ++;
            }
            else
            {
                numIndex++;
            }
        }
        
        
    }
}