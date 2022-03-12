import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        
        int randNum;
           randNum = (int)(Math.random()*20);
        
        try(Scanner user = new Scanner(System.in)) {
            
            int guess;
            int count = 0;
           
              
            System.out.println("Hello! What is your name?");
            String name = user.nextLine();
            System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");
                do{
            System.out.println("Take a guess.");
            guess = user.nextInt(); 
            count++;

            if(guess == randNum)
                  System.out.println("Good job " + name + "You guessed my number in " + count + " guesses!");
                  
           if (guess < randNum)
                 System.out.println("Your guess is too low");  
                
                
            if(guess > randNum)
                System.out.println("Your guess is too high");
                    
                
            
                }while (guess != randNum);
              
                 
              
             
             
        }
       
    }
}
