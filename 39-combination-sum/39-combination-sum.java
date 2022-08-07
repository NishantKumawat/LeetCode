class Solution {
    
    public void recursive_fun(int index, int target, int[] candidates, List<Integer> pick, List<List<Integer>> ans){
        
        if(index==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList < > (pick));
                return;
            }
            else
            {
                return;
            }
        }
        if(candidates[index]<=target)
        {
            pick.add(candidates[index]);
            recursive_fun(index, target-candidates[index], candidates, pick, ans);
            pick.remove(pick.size() - 1);
        }
     
        recursive_fun(index+1, target, candidates, pick, ans);
        
        
        
    }
    
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> pick=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        recursive_fun(0, target, candidates, pick, ans);
        return ans;
    }
}