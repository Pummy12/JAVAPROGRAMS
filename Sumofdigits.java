import java.util.*;
public class Sumofdigits
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        
        int sum=0;
        while(n>0)
        {
            int lastdigit=n%10;
            n=n/10;

            sum=sum+lastdigit;
        }
        System.out.println("The sum of the digits of the number is :"+sum);
        
    }
    
}
