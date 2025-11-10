public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to the Magic 8 🎱 \n Think of a question");

      // Generaye a random integer btwn 1-10 
      int num =  (int) (Math.random() * 10 + 1);
      System.out.println(num);

      // Conditional block to test the value of NUM 
      if (num == 10) {
         System.out.println("erm maybe");
      }
      else if (num == 9) {
         System.out.println("sure diddyblud");
      }
      else if (num == 8) {
         System.out.println("no sigma");
      }
      else if (num == 7) {
         System.out.println("no bro");
      }
      else if (num == 6) {
         System.out.println("i guesss");
      }
      else if (num == 5) {
         System.out.println("doesnt look good");
      }
      else if (num == 4) {
         System.out.println(" 100% no");
      }
      else if (num == 3) {
         System.out.println(" no suckaaa");
      }
      else if (num == 2) {
         System.out.println("if you say so princess");
      }
      else {
         System.out.println("yesss queen");
      }


      double luck = (double) (Math.random()* 10 + 1);
      System.out.println("luck");
      

   } // close main method
} //close class 
