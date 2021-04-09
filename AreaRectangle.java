import java.util.*;
public class AreaRectangle {
    public static void main(String args[])
    {
        int l,b;
        double ar;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        ar=0.5*(l+b);
        System.out.println("Area of the rectangle is :"+ar);
    }
}
