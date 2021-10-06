
/*The length variable is applicable to an array but not for string objects whereas the length() method is applicable for string objects but not for arrays.*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String prefix=strs[0];
        for(int i=1;i<=strs.length-1;i++)
            while(strs[i].indexOf(prefix) !=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }        
        return prefix;
            }
                
        }
    
