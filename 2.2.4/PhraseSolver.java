import java.util.Scanner;

/*
 * Activity 2.2.2
 *
 * The PhraseSolver class the PhraseSolverGame
 */
public class PhraseSolver
{
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }

  public void play()
  {
    Scanner input = new Scanner(System.in);
    Player currentPlayer = player1; 

    while (!solved)
    {
      game.setLetterValue();

      System.out.println("\n------------------------------------");
      System.out.println("Current Player: " + currentPlayer.getName());
      System.out.println("Phrase to solve: " + game.getSolvedPhrase());
      System.out.println("Next letter value: " + game.getCurrentLetterValue());
      System.out.println("Score: " + currentPlayer.getScore());

      System.out.print("Enter a guess (single letter OR full phrase): ");
      String guess = input.nextLine().toLowerCase().trim();

      if (game.isSolved(guess))
      {
        solved = true;
        System.out.println("\nCongratulations " + currentPlayer.getName() + "!");
        System.out.println("You solved the phrase: " + game.getUnsolvedPhrase());
        System.out.println(currentPlayer.getName() + " finished with " + currentPlayer.getScore() + " points!");
      }
      else
      {
        if (guess.length() != 1)
        {
          System.out.println("\nSorry, that guess is incorrect.");
          currentPlayer = (currentPlayer == player1) ? player2 : player1;
          continue;
        }

        boolean correct = game.guessLetter(guess);

        if (correct)
        {
          System.out.println("\nCorrect guess!");
          System.out.println("Updated Phrase: " + game.getSolvedPhrase());

          currentPlayer.addPoints(game.getCurrentLetterValue());
          System.out.println(currentPlayer.getName() + " has " + currentPlayer.getScore() + " points");
        }
        else
        {
          System.out.println("\nSorry, that letter is not in the phrase.");
          currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
      }
    }
  }
}
