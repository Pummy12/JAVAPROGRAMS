import java.util.*;
class Pallindrome1
{
    public static void main(String args[])
    {
        int r,s=0,temp;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(temp==s)
        System.out.println("pallindrome number");
        else
        System.out.println("not pallindrome");
    }    
}
