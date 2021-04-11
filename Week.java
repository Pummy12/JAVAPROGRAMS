import java.util.*;
class Week {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("GIVE INPUT");
        a=sc.nextInt();

        switch(a)
        {
            case 0:System.out.println("MONDAY");
                  break;
            case 1:System.out.println("TUESDAY");
                  break;
            case 2:System.out.println("WEDNESDAY");
                  break;
            case 3:System.out.println("THURSDAY");
                  break;
            case 4:System.out.println("FRIDAY");
                  break;
            case 5:System.out.println("SATURDAY");
                  break;
            case 6:System.out.println("SUNDAY");
                  break;
            default:System.out.println("INVALID INVALID !!");
        }


    }
}
    
