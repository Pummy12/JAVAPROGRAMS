/*Write a program in java to create a class
Bank having ROI data member and find_ROI() member function. Derive three classes
HDFC,ICICI, BOI with find_ROI() function and find the rate of interest of different Banks using
dynamic method dispatch?*/

class Test
{  
public static void main(String args[]){  
Bank b;  
b=new HDFC();  
System.out.println("HDFC Rate of Interest: "+b.find_ROI());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.find_ROI());  
b=new BOI();  
System.out.println("BOI Rate of Interest: "+b.find_ROI());  
}  
}
class Bank
{
double ROI;
double find_ROI()
{
return 0;
}
}  
class HDFC extends Bank
{
double ROI=9.5;  
double find_ROI()
{
return ROI;  
}
}
class ICICI extends Bank
{
double ROI=8.4;  
double find_ROI()
{
return ROI;  
}
}
class BOI extends Bank
{
double ROI=7.3;  
double find_ROI()
{
return ROI;  
}
}
