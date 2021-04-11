import java.util.*;
public class Swap{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER X AND Y:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swap value of X: "+x + "and"+"value of y: "+y);
        //Taking maths function because we need absolute result
        x=Math.abs(x+y);
        y=Math.abs(x-y);
        x=Math.abs(y-x);
        System.out.println("After Swap value of X: "+x + "and"+"value of y: "+y);
    }


}