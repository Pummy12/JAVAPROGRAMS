import java.util.*;
public class BasicInfo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME,SEC,ROLL NO. AND ADDRESS");
        String name=sc.nextLine();
        int sec=sc.nextInt();
        int roll=sc.nextInt();
        //since we are taking two int inputs 
        sc.nextLine(); 
        String address=sc.nextLine();
        System.out.println("NAME IS:"+name);
        System.out.println("SEC IS:"+sec);
        System.out.println("ROLL IS:"+roll);
        System.out.println("ADDRESS IS:"+address);
    }
}
