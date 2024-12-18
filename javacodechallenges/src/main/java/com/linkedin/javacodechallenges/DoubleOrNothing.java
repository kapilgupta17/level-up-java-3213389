package com.linkedin.javacodechallenges;
import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    // TODO: Implement method
    int pts=1;
    boolean gamble=true;
    int result = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("You currently have " + pts + " points. Do you want to gamble? (yes/no):");
    String choice = scanner.nextLine();

    if(choice.equalsIgnoreCase("yes")){
      Random random = new Random();
      int randomChoice = random.nextBoolean() ? 2 : 0;
      
      pts *= randomChoice;

      if (pts == 0) {
        System.out.println("Oh no! You lost everything!");
      } else {
        System.out.println("Great! Your points doubled to " + pts + ".");
      }
    }
    else{
      gamble = false;
      System.out.println("You decided to cash out with " + pts + " points.");
    }
    scanner.close();
    
    
  }
}