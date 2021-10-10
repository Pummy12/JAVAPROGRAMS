//Wap to find whether a number is prime or not
import java.util.*;
class Prime {
public static void main(String args[])
{
    int n;
    int x=0;
    Scanner sc=new Scanner(System.in) ;
    System.out.println("Enter a number");
     n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         if(n%i==0)
         x++;
     }
     if(x==2)
     System.out.println("Prime number");
     else
     System.out.println("Not a prime number");
}    
}
