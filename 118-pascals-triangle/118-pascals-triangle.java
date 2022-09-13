class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<Integer> prev=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {
            List<Integer> curr=new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    curr.add(1);
                }
                else
                {
                    int x=prev.get(j-1)+prev.get(j);
                    curr.add(x);
                }
                
            }
            prev=curr;
            ans.add(prev);
            
        }
        return ans;
    }
}