import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        try (Scanner getInput = new Scanner(System.in)) {
          System.out.println("You are in a land full of dragons.");
          System.out.println("In front of you, you see two caves.");
          System.out.println(
          "In one cave, the dragon is friendly and will share his treasue with you");
          System.out.println("The other dragon is greedy and hungry and will eat you on sight");
          System.out.println("Which cave will you go into? Enter 1 or 2");
          int input = getInput.nextInt();
          System.out.println("You have decided cave " + input);
        
         
        if(input == 1){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you!");
            System.out.println("He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        }catch (Exception e){
            System.out.println("Please enter a valid number.");
        }
    }
}