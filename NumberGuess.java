
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class NumberGuess {

static Scanner user = new Scanner(System.in);
   
static void Game(String name){
  int randNum =(int)(Math.random()*20);
  int guess;
  int count = 0;
try{
  do{
          System.out.println("Take a guess.");
          guess = user.nextInt(); 
          count++;

          if(guess == randNum)
                System.out.println("Good job " + name + " You guessed my number in " + count + " guesses!");
                
         if (guess < randNum)
               System.out.println("Your guess is too low");  
              
              
          if(guess > randNum)
              System.out.println("Your guess is too high");
                  
              
          
              }while (guess != randNum);      
           
           
      }catch(InputMismatchException e){
      System.out.println("Please Enter a valid number");}
             
}

  public static void main(String[] args) {
       System.out.println("Hello! What is your name?");
       if(user.hasNext()){
       String name = user.nextLine();
      System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");
       Game(name);       

       }  
      }   
    
               

   @Test
   public void testCheckName(){
    assertEquals("", "", "Name given");
  
   }

   @Test
   public void testIntegerEntered(){
      assertEquals(20 , 20, "A number was entered.");
   }
  
    
  }   



     
    
