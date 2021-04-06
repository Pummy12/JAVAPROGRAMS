//Input marks from user and find the average marks using array data structure
//**********AUTHOR-PUMMY JHA**********
import java.util.*;
public class AvgMarks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF NUMBERS");
        int n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("ENTER THE MARKS:");
        for(int i=0;i<n;i++)
        {
          marks[i]=sc.nextInt();

        }
    int averagemarks=0;
    for(int i=0;i<n;i++){
    averagemarks+=marks[i];
    }
    averagemarks/=n;
    System.out.println("THE AVERAGE MARKS IS :"+averagemarks);

    }
}
