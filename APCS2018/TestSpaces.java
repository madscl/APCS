public class TestSpaces {
   public static void main(String[] args) {
      getAnswers();
   }
   
   public static void getAnswers() {
      String a = "";
      String a2 = "";
      String a3 = "";
      String temp = "Cats and";
      int j = 0;
      for(int i = 0; i < temp.length(); i++) {
         if(Character.isWhitespace(temp.charAt(i))) {
            j++;
         }
      }
      System.out.println(j);
      a = temp.substring(0, temp.indexOf(" "));
      temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
      System.out.println(a);
      if(j == 2) {
         a2 = temp.substring(0, temp.indexOf(" "));
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a3 = temp.substring(0, temp.length());
         System.out.println(a2);
         System.out.println(a3);
      } else { 
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a2 = temp.substring(0, temp.length());
         System.out.print(a2);
      }
       
   }

}
   
