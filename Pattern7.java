/*
   A
  BC
 CDE
DEFG
*/
public class Pattern7 {
    public static void main(String args[])
    {
        char k;
        for(int i=1;i<=4;i++)
        {
             k=(char)(64+i);
             for(int j=4;j>=1;j--)
             {
                 if(j<=i)
                 System.out.print(k++);
                 else
                 System.out.print(" ");

             }
             System.out.println();
        }
    }
}
