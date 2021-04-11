//AREA OF TRIANGLE USING HERON'S FORMULA
//PUMMY JHA
import java.util.*;
public class AreaTriangle
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER BASE & HEIGHT ");
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  double c=sc.nextDouble();
  double sp=(a+b+c)/2.0;
  double area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
  System.out.println("AREA OF TRIANGLE:"+area);
  }
}