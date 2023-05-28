//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        long first = -1;
        long last = -1;
        
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (low + high)/2;
            // System.out.println("MID 1 : " + mid);
            if((long)arr[mid] == x){
                // if( (mid + 1) <= high  && arr[mid+1]  )
                int index1 = mid-1;
                int index2 = mid+1;
                first = mid;
                last = mid;
                while(index1>=0 && arr[index1] == x){
                    first = index1;
                    index1--;
                }
                while(index2 <= high && arr[index2] == x){
                    last = index2;
                    index2++;
                }
                ans.add(first);
                ans.add(last);
                return ans;
            } else if(arr[mid] > x){
                high = mid - 1;
            } else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        
        ans.add((long)-1);
        ans.add((long)-1);
        return ans;
       
        // if(first == -1 && last == -1){
            
        //     ans.add((long)-1);
        //     ans.add((long)-1);
        //     return ans;
        // } else if(first == -1){
        //     first = last;
        //     ans.add(first);
        //     ans.add(last);
        //     return ans;
        // } else if(last == -1){
        //     last = first;
        //     ans.add(first);
        //     ans.add(last);
        //     return ans;
        // } else{
        //     ans.add(first);
        //     ans.add(last);
        //     return ans;
        // }
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends