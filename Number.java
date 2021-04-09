import java.util.*;
class Number {
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        if(num>500)
        num=num+50;
        else if(num>400 && num<=499)
        num=num+40;
        else if(num>300 && num<=399)
        num=num+30;
        else if(num>200 && num<=299)
        num=num+20;
        else if(num>100 && num<=199)
        num=num+10;
        else if(num>50 && num<=99)
        num=num+5;
        System.out.println((+num));
    }
    
}
