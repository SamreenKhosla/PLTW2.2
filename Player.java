
import java.util.Scanner;

/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;


  /* your code here - constructor(s) */ 
  public Player() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter player's name: ");
    name = input.nextLine();
    score = 0;
    System.out.println("Welcome, " + name + " to the Phrase Solver Game!");
  }

  public Player(String inputName) {
    name = inputName;
    score = 0;
    System.out.println("Welcome, " + name + " to the Phrase Solver Game!");
  }

  /* your code here - accessor(s) */ 
  public String getName() {
    return name;
  }

  public int getScore() {
    return score 
  }

  /* your code here - mutator(s) */ 
}