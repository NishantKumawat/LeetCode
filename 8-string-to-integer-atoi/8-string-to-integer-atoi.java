class Solution {
    public int myAtoi(String s) {
        
        
        
        s=s.trim();
        long ans=0;
        int i=0,signed=1;
        int Min=Integer.MIN_VALUE, Max=Integer.MAX_VALUE;
        
        if(s.length()==0)
        {
            return 0;
        }
        if(s.charAt(0)=='-' || s.charAt(0)=='+')
        {
            i++;
            if(s.charAt(0)=='-')
            {
                signed=-1;
            }
        }
        
        while(i<s.length())
        {
            
            if(s.charAt(i)==' ' || Character.isDigit(s.charAt(i))==false)
            {
                break; 
            }
            if(Character.isDigit(s.charAt(i)))
            {
                ans=ans*10+(s.charAt(i)-'0');
            }
            
            if(signed==-1 && (-1)*ans<Min) return Min;
            if(signed==1 && ans>Max) return Max;
            
            i++;
        }
        
        return (int)(signed*ans);
            
    }
}
