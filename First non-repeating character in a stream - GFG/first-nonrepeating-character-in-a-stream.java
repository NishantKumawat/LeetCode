//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Set <Character> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        for (int i =0; i< A.length(); i++){
            char ch = A.charAt(i);
            if (!set.contains(ch)){
                list.add(ch);
                set.add(ch);
            }
            else {
                int index = list.indexOf(ch);
                
                if (index != -1){
                    list.remove (index);
                }
            }
            if (list.isEmpty())
            ans.append("#");
            else 
            ans.append(list.get(0));
        }
        return ans.toString();
    }
}
