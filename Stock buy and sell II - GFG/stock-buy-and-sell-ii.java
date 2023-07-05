//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int profit = 0;
        
        for(int i = 0; i<n; i++){
            
            if(prices[i] < buy){
                buy = prices[i];
                // System.out.println("Buy : " + buy);
            } else if(prices[i] > buy){
                
                sell = prices[i];
                // System.out.println("Sell : " + sell);
                
                if( i == n-1 || prices[i+1] < sell ){
                    profit += Math.subtractExact(sell,buy);
                    buy = Integer.MAX_VALUE; 
                }
                
                // if( (i+1) < n && prices[i+1] < prices[i]){
                //     sell = prices[i];
                    
                //     System.out.println("Sell : " + sell);
                //     profit += Math.subtractExact(sell,buy);
                //     // buy = Integer.MAX_VALUE;
                // }
            }
        }
        return profit;
    }
}
        
