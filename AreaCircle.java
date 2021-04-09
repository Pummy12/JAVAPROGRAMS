import java.util.Scanner;
class AreaCircle {
 public static void main(String args[])
 {
int r;
double pi=3.14,area;
Scanner s= new Scanner(System.in);
System.out.println("enter the radius,please !");
r=s.nextInt();
area=pi*r*r;
System.out.println("Area of Circle:"+area);
 }   
}
