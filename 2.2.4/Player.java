import java.util.Scanner;

/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
public class Player
{
  private String name;
  private int score;

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

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void addPoints(int points) {
    score += points;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void resetScore() {
    score = 0;
  }
}
