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

      // 1. Show the current state of the board (with underscores)
      System.out.println("\n------------------------------------");
      System.out.println("Current Player: " + currentPlayer.getName());
      System.out.println("Phrase to solve: " + game.getSolvedPhrase()); // Updated logic
      System.out.println("Next letter value: " + game.getCurrentLetterValue());

      System.out.print("Guess a letter: ");
      String guess = input.nextLine().toLowerCase(); // Use lowercase to match phrase typical case

      boolean correct = game.guessLetter(guess);

      if (correct)
      {
        System.out.println("\nCorrect guess!");
        // 2. Immediately show the updated phrase after the correct guess
        System.out.println("Updated Phrase: " + game.getSolvedPhrase());
      }
      else
      {
        System.out.println("\nSorry, that letter is not in the phrase.");
        // Switch players if guess was incorrect
        if (currentPlayer == player1) {
          currentPlayer = player2;
        } else {
          currentPlayer = player1;
        }
      }

      // Check if phrase is fully solved
      if (!game.getSolvedPhrase().contains("_"))
      {
        solved = true;
        System.out.println("\nCongratulations " + currentPlayer.getName() + "!");
        System.out.println("You solved the phrase: " + game.getUnsolvedPhrase());
      }
    }
  }
}
