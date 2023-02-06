import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DieTesterView extends JFrame
{
    // Instance Variables
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 800;
    private ArrayList<Die> dice;

    // Constructor

    public DieTesterView(ArrayList<Die> dice)
    {
        this.dice = dice;
        this.setTitle("DICE GAME!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    // Methods

    public void paint(Graphics g)
    {

    }
}
