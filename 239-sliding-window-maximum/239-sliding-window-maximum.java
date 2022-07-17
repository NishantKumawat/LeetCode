import java.util.*;
class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> q= new ArrayDeque<>();
        
        int[] r=new int[nums.length-k+1];
        int ri=0;
         
        for(int i=0;i<nums.length;i++)
        {
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = nums[q.peek()];
            }    
        }
        return r;
                
    }
}