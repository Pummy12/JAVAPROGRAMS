import java.util.*;
class Divbyfive
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(arr[i]%5==0)
            {
                System.out.println(+arr[i]);
            }
        }
    }
    
}
