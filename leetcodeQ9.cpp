//Leetcode_Pallindrome Q9
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0))
        {
            return false;
        }
        int reversenum=0;
        while(x>reversenum){
            int pop=x%10;
            reversenum =reversenum*10 + pop;
            x/=10;
        }
        return x==reversenum || x==reversenum/10;
        }
        
    };
