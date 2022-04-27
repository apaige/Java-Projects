import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Hangman {
    public static void main(String[] args) {
 
       System.out.println("Guess a letter"); 
        ArrayList<String> game = new ArrayList<>();
        
        game.add("+---+");
        game.add("|");
        game.add("|");
        game.add("|");
        game.add("= = =");
        game.add("_ _ _ _");
        for(String s : game){
              System.out.println(s);
        }
       
      System.out.print(compguess());  
      
      guess();
    }
    public static void guess() {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      char letter = input.charAt(0);
      scanner.close();
      char[] r = new char[compguess().length()];
      for(int i = 0; i < compguess().length();i++){
         r[i] = compguess().charAt(i);
      }
      List ch = Arrays.asList(r);
       if(ch.contains(letter)){
           System.out.println(letter);
       }
        /**
         * if character is in random print it at the index
         * continue to loop until word is guessed or man is hanged
         */
    }

    public static String compguess(){
       String[] wordbank = new String[] { "huge","open","ugly","book","loud","yarn","luck"};
       String words = wordbank[(int) (Math.random() * wordbank.length)];
        return words;
    }
}
