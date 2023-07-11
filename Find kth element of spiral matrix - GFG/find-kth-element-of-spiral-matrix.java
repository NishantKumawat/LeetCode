//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	int r=0;
	int lr=n-1;
	int c=0;
	int lc= m-1;
	ArrayList<Integer> res = new ArrayList<>();
	while(r<=lr && c<=lc){
	    for(int i=r; i<=lc;i++){
	        res.add(A[r][i]);
	    }
	    r++;
	    
	    for(int i=r;i<=lr;i++){
	        res.add(A[i][lc]);
	    }
	    lc--;
	    
	    if(r<=lr){
	        for(int i=lc; i>=c; i--){
	            res.add(A[lr][i]);
	        }
	        lr--;
	    }
	    
	    if(c<=lc){
	        for(int i=lr;i>=r;i--){
	            res.add(A[i][c]);
	        }
	        c++;
	    }
	}
	if(res.get(k-1)!=null){
	    return res.get(k-1);
	}
	return -1;
    }
}