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
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    ArrayList<Integer> res = new ArrayList<>();
	    int r=0,lr=n-1,c=0,lc=m-1;
	    while(r<=lr && c<=lc){
	        //top
	        for(int i=c;i<=lc;i++){
	            res.add(a[r][i]);
	        }
	        r++;
	        //right
	        for(int i=r;i<=lr;i++){
	            res.add(a[i][lc]);
	        }
	        lc--;
	        //bottom
	        if(r<=lr){
	            for(int i=lc;i>=c;i--){
	                res.add(a[lr][i]);
	            }
	            lr--;
	        }
	        
	        //left
	        if(c<=lc){
	            for(int i=lr;i>=r;i--){
	                res.add(a[i][c]);
	            }
	            c++;
	        }
	       // System.out.println(r+ " "+lr+ " " +c+" "+lc);
	        
	    }
	    if(res.get(k-1)!=null)
	    return res.get(k-1);
	    else
	    return -1;
	}
	
}