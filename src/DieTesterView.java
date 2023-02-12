// Aarav Gupta
// Gui Game Project

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DieTesterView extends JFrame
{
    // Instance Variables
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 800;
    private DieTester d;
    private final Image numberOne;
    private final Image numberTwo;
    private final Image numberThree;
    private final Image numberFour;
    private final Image numberFive;
    private final Image numberSix;
    private final Image questionMark;
    private final Image background;
    private int checker;
    private final Color newColor;

    // Constructor
    public DieTesterView(DieTester d)
    {
        this.d = d;
        this.setTitle("DICE GAME!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        numberOne = new ImageIcon("Resources/NumberOne.jpeg").getImage();
        numberTwo = new ImageIcon("Resources/NumberTwo.png").getImage();
        numberThree = new ImageIcon("Resources/NumberThree.png").getImage();
        numberFour = new ImageIcon("Resources/NumberFour.png").getImage();
        numberFive = new ImageIcon("Resources/NumberFive.png").getImage();
        numberSix = new ImageIcon("Resources/NumberSix.jpeg").getImage();
        questionMark = new ImageIcon("Resources/QuestionMark.jpg").getImage();
        background = new ImageIcon("Resources/PoolTableBackground.jpg").getImage();
        newColor = new Color(33, 179, 30);
    }

    // Prints the outcome of the game
    public void determineWinner(Graphics g)
    {
        if (d.getCheckWinner() == 3)
        {
            g.setColor(newColor);
            g.fillRect(250, 350, 300, 100);
            g.setColor(Color.BLACK);
            g.drawString("Tie!", 350, 420);
        }
        else if (d.getCheckWinner() == 1)
        {
            g.setColor(newColor);
            g.fillRect(250, 350, 300, 100);
            g.setColor(Color.BLACK);
            g.drawString("Player 1 Wins!", 250, 420);
        }
        else if (d.getCheckWinner() == 2)
        {
            g.setColor(newColor);
            g.fillRect(250, 350, 300, 100);
            g.setColor(Color.BLACK);
            g.drawString("Player 2 Wins!", 250, 420);
        }
    }
    public void checkTurn(Graphics g)
    {
        // Checks if it's player one's turn
        if (d.getCheckPlayer() == 1)
        {
            g.setColor(Color.BLACK);
            g.drawString("Player 1's turn!", 250, 400);

            // Prints the die based on player one's roll
            if (d.getPlayerOneRoll() == 1)
            {
                g.drawImage(numberOne, 150, 560,100, 100, this);
                checker = 1;
            }
            else if (d.getPlayerOneRoll() == 2)
            {
                g.drawImage(numberTwo, 150, 560,100, 100, this);
                checker = 2;
            }
            else if (d.getPlayerOneRoll() == 3)
            {
                g.drawImage(numberThree, 150, 560,100, 100, this);
                checker = 3;
            }
            else if (d.getPlayerOneRoll() == 4)
            {
                g.drawImage(numberFour, 150, 560,100, 100, this);
                checker = 4;
            }
            else if (d.getPlayerOneRoll() == 5)
            {
                g.drawImage(numberFive, 150, 560,100, 100, this);
                checker = 5;
            }
            else if (d.getPlayerOneRoll() == 6)
            {
                g.drawImage(numberSix, 150, 560,100, 100, this);
                checker = 6;
            }
        }

        // Check if it's player two's turn
        else if (d.getCheckPlayer() == 2)
        {
            g.setColor(newColor);
            g.fillRect(250, 350, 300, 100);
            g.setColor(Color.BLACK);
            g.drawString("Player 2's turn!", 250, 400);

            // Reprints player one's die, so it stays on the display
            if (d.getPlayerTwoRoll() == 1)
            {
                g.drawImage(numberOne, 550, 560,100, 100, this);
            }
            else if (d.getPlayerTwoRoll() == 2)
            {
                g.drawImage(numberTwo, 550, 560,100, 100, this);
            }
            else if (d.getPlayerTwoRoll() == 3)
            {
                g.drawImage(numberThree, 550, 560,100, 100, this);
            }
            else if (d.getPlayerTwoRoll() == 4)
            {
                g.drawImage(numberFour, 550, 560,100, 100, this);
            }
            else if (d.getPlayerTwoRoll() == 5)
            {
                g.drawImage(numberFive, 550, 560,100, 100, this);
            }
            else if (d.getPlayerTwoRoll() == 6)
            {
                g.drawImage(numberSix, 550, 560,100, 100, this);
            }

            // Prints player two's di
            if (checker == 1)
            {
                g.drawImage(numberOne, 150, 560,100, 100, this);
            }
            else if (checker == 2)
            {
                g.drawImage(numberTwo, 150, 560,100, 100, this);
            }
            else if (checker == 3)
            {
                g.drawImage(numberThree, 150, 560,100, 100, this);
            }
            else if (checker == 4)
            {
                g.drawImage(numberFour, 150, 560,100, 100, this);
            }
            else if (checker == 5)
            {
                g.drawImage(numberFive, 150, 560,100, 100, this);
            }
            else if (checker == 6)
            {
                g.drawImage(numberSix, 150, 560,100, 100, this);
            }
        }
    }
    public void printTargetNum(Graphics g)
    {
        // Prints the target num only after the user has requested it
        if (d.getCheckPlayer() != 0)
        {
            g.setFont(new Font("Times", Font.PLAIN, 40));
            if (d.getTargetNumber() == 1)
            {
                g.drawString("1", 570, 150);
            }
            else if (d.getTargetNumber() == 2)
            {
                g.drawString("2",570, 150);
            }
            else if (d.getTargetNumber() == 3)
            {
                g.drawString("3",570, 150);
            }
            else if (d.getTargetNumber() == 4)
            {
                g.drawString("4", 570, 150);
            }
            else if (d.getTargetNumber() == 5)
            {
                g.drawString("5", 570, 150);
            }
            else if (d.getTargetNumber() == 6)
            {
                g.drawString("6",570, 150);
            }

        }
    }
    public void paint(Graphics g)
    {
        // Resets background to pool table
        g.drawImage(background, 0, 0, 800, 800, this);

        // Ensures question mark only repainted for Player 2
        if (d.getCheckPlayer() != 2)
        {
            g.drawImage(questionMark, 150, 560, 100, 100, this);
        }
        g.drawImage(questionMark, 550, 560, 100, 100, this);

        // Prints Initial Indicators
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times", Font.BOLD, 20));
        g.drawString("Player 1's Roll", 125, 685);
        g.drawString("Player 2's Roll", 525, 685);
        g.setFont(new Font("Times", Font.PLAIN, 40));
        g.drawString("Target Number:", 250, 150);
        printTargetNum(g);
        checkTurn(g);
        determineWinner(g);
    }
}
