//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

class Solution {
    public double myPow(double x, int n) {
        long num=n;
        double ans=1.0;
        if(n < 0){
            num=-1* num;
            }
        while(num > 0){
            if(num % 2==0){
            x=x*x;
            num=num/2;
            }
                else{
                    ans=ans * x;
                    num=num - 1;
                }
        }
            if(num<0)
            {
                return (double)(1.0) / (double)(ans); 
            }
        return ans;
        
       } 
    }
