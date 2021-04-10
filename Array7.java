import java.util.*;
class Array7
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        int i,temp;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        i=0;
        while(i<10-1)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;  
        }       
        System.out.println("after swapping list are:");
        for(i=0;i<10;i++)
        {
            System.out.println(+arr[i]);
        }
    }
    
    
}
