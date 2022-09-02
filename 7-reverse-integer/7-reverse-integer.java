class Solution {
    public int reverse(int x) {
        
        String s=Integer.toString(x);
        String ans="";
        int i=s.length()-1;
        
        if(s.charAt(0)=='-')
            ans=ans+s.charAt(0);
        
        while(i>=0)
        {
            if(s.charAt(i)!='-')
            ans=ans+s.charAt(i);
            i--;
        }
        long a=Long.valueOf(ans);
        if(a>=Integer.MIN_VALUE && a<Integer.MAX_VALUE)
        {
           int fa=(int)a;
           return fa; 
        }
        else
            return 0; 
        
    }
}