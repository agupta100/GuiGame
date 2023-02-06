import java.util.Scanner;

public class DieTester
{
    // Instance Variables
    private String input;
    private int defaultTargetNum;
    private int randomTargetNum;
    private int playerOneSides;
    private int playerTwoSides;
    private int playerOneRoll;
    private int playerTwoRoll;
    private DieTesterView d;

    public DieTester()
    {
        input = "";
        defaultTargetNum = 0;
        randomTargetNum = 0;
        playerOneSides = 0;
        playerTwoSides = 0;
        playerOneRoll = 0;
        playerTwoRoll = 0;
    }
    public void printInstructions()
    {
        // Instructions
        System.out.println("This is a two player dice game.");
        System.out.println();
        System.out.print("The first player chooses the number of sides they");
        System.out.println("want and rolls a\ndi based on that number of sides.");
        System.out.println();
        System.out.print("The second player follows a similar process,");
        System.out.print("choosing the number ofsides they want and rolling a di");
        System.out.println("based on that number of sides.");
        System.out.println();
        System.out.print("Whoever rolls a number closer to the target number");
        System.out.println("wins");
        System.out.print("You can choose between a default target num or a");
        System.out.println("random target num");
        System.out.println();
    }

    public void createTargetNum()
    {
        // Creates the target number 
        boolean valid = false;
        Scanner a = new Scanner(System.in);
        Die sample = new Die();
        defaultTargetNum = sample.defaultTargetNum();
        randomTargetNum = sample.getTargetNum();
        System.out.print("Enter the letter d if you want the default target");
        System.out.println("num or enter r if you want a random target num: ");
        input = a.nextLine();
        // Prints target number depending on user input 
        if (input.equals("d"))
        {
            System.out.println("The target number is " + defaultTargetNum +"\n");
        }
        else if (input.equals("r"))
        {
            System.out.println("The target number is " + randomTargetNum +"\n");
        }
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
        // Determines winner if player inputted d 
        if (input.equals("d"))
        {
            if (Math.abs(playerOneRoll - defaultTargetNum) >
                    Math.abs(playerTwoRoll - defaultTargetNum))
            {
                System.out.println("Player 2 wins!");
            }
            else if (Math.abs(playerTwoRoll - defaultTargetNum) >
                    Math.abs(playerOneRoll - defaultTargetNum))
            {
                System.out.println("Player 1 wins!");
            }
            else
            {
                tie();
            }
        }
        // Determines winner if player inputted r 
        if (input.equals("r"))
        {
            if (Math.abs(playerOneRoll - randomTargetNum) >
                    Math.abs(playerTwoRoll - randomTargetNum))
            {
                System.out.println("Player 2 wins!");
            }
            else if (Math.abs(playerTwoRoll - randomTargetNum) >
                    Math.abs(playerOneRoll - randomTargetNum))
            {
                System.out.println("Player 1 wins!");
            }
            else
            {
                tie();
            }
        }
    }

    public void playGame()
    {
        printInstructions();
        createTargetNum();
        playerOneDie();
        System.out.println();
        playerTwoDie();
        determineWinner();
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