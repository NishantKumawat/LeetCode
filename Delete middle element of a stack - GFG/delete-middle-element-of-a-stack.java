//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid;
        if(sizeOfStack % 2 == 0) 
            mid = (sizeOfStack/2)-1;
        else{
            mid = sizeOfStack/2;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        int i = sizeOfStack - 1;
        
        while(i!=mid){
            int temp = s.pop();
            arr.add(temp);
            i--;
        }
        s.pop();
        // System.out.println("final stack : " + s);
        // System.out.println("ArrayLisy" + arr);
        
        for(int k=arr.size()-1;k>=0;k--){
            s.push(arr.get(k));
        }
    } 
}

