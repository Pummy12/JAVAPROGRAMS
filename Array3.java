import java.util.*;
class Array3
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        int i,x,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a number");
        x=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==x)
            {
               k++;
            }
        }
        System.out.println("frequency of the number="+k);
    }
    
    
}