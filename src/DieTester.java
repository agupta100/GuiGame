import java.lang.annotation.Target;
import java.util.Scanner;

public class DieTester
{
    // Instance Variables
    private String input;
    private int TargetNum;
    private int playerOneSides;
    private int playerTwoSides;
    private int playerOneRoll;
    private int playerTwoRoll;
    private DieTesterView window;
    private int checkPlayer;
    private int checkWinner;
    // int player turn (for getter method)

    public DieTester()
    {
        window = new DieTesterView(this);
        input = "";
        TargetNum = 0;
        playerOneSides = 0;
        playerTwoSides = 0;
        playerOneRoll = 0;
        playerTwoRoll = 0;
    }
    public void printInstructions()
    {
        // Instructions
        System.out.println("This is a two player dice game. The goal of the game is to roll a di that is " +
                "closest to the target number. ");
        System.out.print("The game starts off with a player choosing the target number. ");
        System.out.print("The first player chooses the number of sides they want and rolls a" +
                " di based on that number of sides.");
        System.out.println();
        System.out.print("The second player follows a similar process, choosing the number of sides they want and" +
                " rolling a di based on that number of sides.");
        System.out.println();
        System.out.print("Whoever rolls a number closer to the target number wins. ");
        System.out.println();
        System.out.println();
    }

    public void createTargetNum()
    {
        // Creates the target number 
        boolean valid = false;
        Scanner a = new Scanner(System.in);
        Die sample = new Die();
        TargetNum = sample.getTargetNum();
        System.out.print("Click any character to get the target num: ");
        a.nextLine();
        // Prints target number
        System.out.println("The target number is " + TargetNum +"\n");
    }

    public void playerOneDie()
    {
        // Creates die for Player 1
        Scanner s = new Scanner(System.in);
        System.out.println("Player 1's turn: ");
        System.out.println("How many sides do you want?");
        playerOneSides = s.nextInt();
        Die die1 = new Die(playerOneSides);
        System.out.println();
        System.out.println(die1);
        playerOneRoll = die1.roll();
        System.out.println("You rolled a " + playerOneRoll);

    }

    public void playerTwoDie()
    {
        // Creates die for Player 2
        Scanner a = new Scanner(System.in);
        System.out.println("Player 2's turn: ");
        System.out.println("How many sides do you want?");
        playerTwoSides = a.nextInt();
        Die die2 = new Die(playerTwoSides);
        System.out.println();
        System.out.println(die2);
        playerTwoRoll = die2.roll();
        System.out.println("You rolled a " + playerTwoRoll);
        System.out.println();
    }


    public void determineWinner()
    {
        // Determines winner
        if (Math.abs(playerOneRoll - TargetNum) >
                Math.abs(playerTwoRoll - TargetNum))
        {
            checkWinner = 2;
            System.out.println("Player 2 wins!");
        }
        else if (Math.abs(playerTwoRoll - TargetNum) >
                Math.abs(playerOneRoll - TargetNum))
        {
            checkWinner = 1;
            System.out.println("Player 1 wins!");
        }
        else
        {
            checkWinner = 3;
            tie();
        }
    }

    public int getCheckPlayer()
    {
        return checkPlayer;
    }

    public int getPlayerOneRoll()
    {
        return playerOneRoll;
    }

    public int getPlayerTwoRoll()
    {
        return playerTwoRoll;
    }

    public int getTargetNumber()
    {
        return TargetNum;
    }

    public int getCheckWinner()
    {
        return checkWinner;
    }


    // Add check player to end of methods
    public void playGame()
    {
        Scanner s = new Scanner(System.in);
        printInstructions();
        window.repaint();
        createTargetNum();
        checkPlayer = 3;
        window.repaint();
        System.out.println("Enter any character to continue: ");
        s.nextLine();
        window.repaint();
        checkPlayer = 1;
        playerOneDie();
        window.repaint();
        System.out.println();
        System.out.println("Player 2, enter any character to continue: ");
        s.nextLine();
        System.out.println();
        checkPlayer = 2;
        window.repaint();
        playerTwoDie();
        window.repaint();
        determineWinner();
        window.repaint();
    }
    public static void main(String[] args)
    {
        DieTester dg = new DieTester();
        dg.playGame();
    }

    // Methods
    public static void tie()
    {
        System.out.println("Tie");
    }

}