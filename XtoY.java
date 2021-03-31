import java.util.*;
public class XtoY {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number X:");
        int x=sc.nextInt();
        System.out.println("Enter the number Y:");
        int y=sc.nextInt();
        int result=1;
        for(int i=1;i<=y;i++){
            result=result*x;
        }
        System.out.println("Value is :"+result);
        }
    
}
