//Write a program to overload subtract method with various parameters in a class in Java.

class Overload2{  
    void subtract(int a,int b)
    {
        if(a>b){
            System.out.println(a-b);
        }
        else
        {
            System.out.println(b-a);
        }
       
    }  
    void subtract(double a,double b)
    {
        if(a>b){
            System.out.println(a-b);
        }
        else
        {
            System.out.println(b-a);
        }
       
      
    }  
    public static void main(String args[]){  
    Overload2 obj=new Overload2();  
    obj.subtract(20,20);
    obj.subtract(20.2,20.1);  
    
    }  
  }
