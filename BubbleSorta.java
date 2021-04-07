//BUBBLE SORT TECHNIQUE TO ARRANGE THE ELEMENTS IN ASCENDING ORDER
//AUTHOR-PUMMY
import java.util.*;
public class BubbleSorta {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO. OF NUMBERS:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ELEMENTS OF ARRAY:");
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
         
                System.out.print(a[i] + " ");
            
        }
        
            }
        }
    
    

