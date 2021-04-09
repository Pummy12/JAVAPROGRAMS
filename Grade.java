import java.util.*;

import javax.lang.model.util.ElementScanner6;
 class Grade {
public static void main(String args[])
{
 int a;
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 if(a>=90)
 System.out.println("grade is O");
 else if(a>=80 && a<=89)
 System.out.println("grade is E");
 else if(a>=70 && a<=79)
 System.out.println("grade is A");
 else if(a>=60 && a<=69)
 System.out.println("grade is B");
 else if(a>=50 && a<=59)
 System.out.println("grade is C");
 else if(a>=40 && a<=49)
 System.out.println("grade is D");
 else
System.out.println("FAIL");  
}    
}
