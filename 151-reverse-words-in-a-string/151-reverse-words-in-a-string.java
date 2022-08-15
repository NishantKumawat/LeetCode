import java.util.*;
class Solution {
    public String reverseWords(String s) {
        
        int len=s.length()-1;
        // s=s.trim();
        // s = s.replaceAll("\\s+", " ");
        String str="";
        Vector<String> v=new Vector<>();
        
        for(int i=0;i<=len;i++)
        {
            if(!Character.isWhitespace(s.charAt(i)))
            {
                str+=s.charAt(i);
                System.out.println(str);
            }
           
            else if(!str.isEmpty())
            {
               v.add(str);
               str="";
            }
                
            
        }
        if(!str.isEmpty())
            {
               v.add(str);
               str="";
            }
          String ans="";
         for(int i=v.size()-1;i>=0;i--)
         {
              ans=ans.concat(v.get(i));
              if(i!=0)
              ans+=' ';  
         }
        System.out.println(v);
        return ans;
    }
}