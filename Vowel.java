class Vowel {

    public static void main(String[] args) {
      String line = "This website is pummy";
      int vowels = 0;
  
      line = line.toLowerCase();
      for (int i = 0; i < line.length(); ++i) {
        char ch = line.charAt(i);
  
        // check if character is any of a, e, i, o, u
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          ++vowels;
        }
        }
        
       
      }
  
      System.out.println("Vowels: " + vowels);
      
    }
  