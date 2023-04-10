//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        // for(int row = 0;row<matrix.length;row++){
        //     for(int col =0;col<matrix[0].length;col++){
        //         if(col<n-col-1){
        //             int temp = matrix[row][col];
        //             matrix[row][col] = matrix[row][n-col-1];
        //             matrix[row][n-col-1] = temp;
        //         }
        //     }
        // }
        for(int row = 0;row<matrix.length;row++){
            for(int col =0;col<matrix[0].length;col++){
                if(col<row){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
                }
            }
        }
        for(int col =0;col<matrix[0].length;col++){
            for(int row = 0;row<matrix.length;row++){
                if(row < n-row-1){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[n-row-1][col];
                    matrix[n-row-1][col] = temp;
                    
                }
            }
        }
    }
}

// 3 6 9
// 2 5 4
// 1 8 7


// 1 2 3
// 4 5 6 
// 7 8 9


// 1 4 7
// 2 5 8
// 3 6 9

