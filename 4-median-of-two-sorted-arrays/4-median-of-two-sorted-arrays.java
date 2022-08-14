class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int t=nums1.length+nums2.length;
        int j=0;
        int[] ans=new int[t];
        double res=0.0;
        
        for(int i=0;i<nums1.length;i++)
        {
            ans[j]=nums1[i];
            j++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            ans[j]=nums2[i];
            j++;
        }
        Arrays.sort(ans);
        if(t==1)
        {
            return (double)ans[0];
        }
        if(t%2==0)
        {
            t=t/2;
            int x=t-1;
            System.out.println(ans[x]);
            System.out.println(ans[t]);
            res=(double)ans[t];
            res+=(double)ans[x];
            System.out.println(res);
            res=res/2;
            System.out.println(res);
            
        }
        else if(t%2!=0)
        {
            t=t/2;
            res=(double)ans[t];   
        }
        return res;
    }
}