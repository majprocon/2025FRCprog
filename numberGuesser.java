import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(11); 
    int guess;
    boolean hasGuessed = false;
    
    System.out.println("Pick a number from 0-10");
    
   while (!hasGuessed) {
    System.out.print("Enter your guess: ");
       guess = s.nextInt();
     
     if (guess == randomNumber) {
       System.out.println("You guessed it");
       hasGuessed = true;
       
   } else if (guess < randomNumber) {
       System.out.println("Too low");
       
   } else {
       System.out.println("Too high");
     }
    }
  }
}
