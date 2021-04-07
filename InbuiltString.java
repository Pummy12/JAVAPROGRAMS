public class InbuiltString {
  public static void main(String args[])
  {
      String name ="PUMMY";
      String surname ="JHA";
      String surname1=" ";
      String name2=new String("PUMMY");
      String nam= "              PUMMY           ";
     System.out.println(name.charAt(2)); //gives the character from particular index value
     System.out.println(surname.length());//finds the length of a particular string
     System.out.println(name.substring(1));//finds the value from the given index till last
     System.out.println(name.substring(1,4));//finds the value from the start position to the last index position -1
     System.out.println(name.contains("UMM"));//check boolean value if the particular string is present or not
     System.out.println(name.equals(name2));//checks the value of two strings and returns boolean value
     System.out.println(surname1.isEmpty());//checks whether string is empty or not
     System.out.println(name.replace('M','N'));//replaces old value with new value
     System.out.println(nam.trim());//removes the trailing spaces from both sides
     System.out.println(surname.indexOf('H'));//finds the index value from the string and if the character is not present it returns -1
    }  
}
