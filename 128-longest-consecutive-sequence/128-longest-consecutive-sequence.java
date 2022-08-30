class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return 1;
        
        Set<Integer> set=new HashSet<>();
        int longStreak=1;
        
        for(int i: nums)
        {
            set.add(i);
        }
        
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int currNum=i;
                int curr=1;
                
                while(set.contains(currNum+1))
                {
                    curr++;
                    currNum++;
                }
                
                longStreak=Math.max(curr,longStreak);
            }
        }
        return longStreak;
    }
}