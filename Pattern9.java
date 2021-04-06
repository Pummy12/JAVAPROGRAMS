

public class Pattern9 
{
    public static void main(String args[])
    {
        char k;
        for(int i=1;i<=5;i++)
        {
            k=(char)(64 + i);
            for(int j=1;j<=5;j++)
            {
         if(j>=6-i && j<=5)
        
             System.out.print(k--);
             else 
             System.out.print(" ");
            }
         System.out.println();
            }
        }
    }
    

