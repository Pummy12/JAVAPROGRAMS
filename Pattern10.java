/*
1
10
101
1010
10101
101010
*/
public class Pattern10 {
    public static void main(String args[])
    {
        for(int i=1;i<=6;i++)
        {
            int x=0;
            int y=1;
            for(int j=1;j<=i;j++)
            {
          if(j%2==0)
          System.out.print(x);
          else
          System.out.print(y);
            }
            System.out.println(); 
        }
    }
    
}
