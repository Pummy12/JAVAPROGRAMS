//THE OUTPUT IS FALSE BECAUSE ONE NAME WILL GO IN THE STRING POOL AREA WHEREAS name1 WILL GO IN 
//HEAP AREA 
public class StringIntroduction {
    public static void main(String args[])
    {
    String name= "Pummy";
    String name1= new String("Pummy");
    System.out.println(name == name1);
    }
    
}
