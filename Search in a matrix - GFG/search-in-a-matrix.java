//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        if(N==1){
            for(int i=0; i<M; i++){
                if(mat[0][i] == X){
                    return 1;
                }
            }
            return 0;
        } else{
            int row = 1;
            while(row<N){
                if(mat[row][0]>X || mat[row-1][M-1] >= X){
                    for(int i = 0;i<M;i++){
                        if(mat[row-1][i] == X){
                            return 1;
                        }
                    }
                }
                row++;
            }
            for(int i=0;i<M;i++){
                if(mat[N-1][i] == X){
                    return 1;
                }
            }
            return 0;
        }
    }
}