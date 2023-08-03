//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int[] freq = new int[26];
        // char[] alpha = {'a','b','c','d','e','f','g'}
     
        // Update the frequency array
        for (int i = 0; i < arr.length(); i++)
        {
            freq[arr.charAt(i) - 'a']++;
        }
        
        String ans = "";
        
        for (int i = 0; i < freq.length; i++)
        {
            while(freq[i] != 0){
                ans += (char)(i + 'a');
                freq[i]--;
            }
            
            // System.out.print((char)(i + 'a') +""+ freq[i]);
        }
        return ans;
    }
}