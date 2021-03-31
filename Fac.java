import java.util.*;
public class Fac {
   public static void main(String args[])
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("ENTER A NUMBER :");
       int n =sc.nextInt();
       int f=1;
       for(int i =1;i<=n;i++)
       {
           f=f*i;
       }
       System.out.println("Factorial is "+f);
   } 
}
