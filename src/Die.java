import java.awt.*;

public class Die
{
    /** Instance Variables **/
    private int sides;

    /** Constructors **/

    public Die()
    {

    }

    public Die(int sides) {
        this.sides = sides;
    }


    /** Methods **/
    public int getSides() {
        return sides;
    }

    /**
     * Returns a random int between 1 and
     * the number of sides on the Die
     */
    public int roll() {
        int num = (int)(Math.random()*sides) + 1;
        return num;
    }

    /**
     * Rolls the dice the numRolls times
     * and returns the max value of the rolls
     */
    public int getMaxRoll(int numRolls) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numRolls; i++) {
            int num = roll();
            max = Math.max(max, num);
        }

        return max;
    }

    // Gets random target num
    public int getTargetNum()
    {
        return (int)(Math.random() * 6) + 1;
    }


    /**
     * TODO: Write a method that rolls the
     * die numRolls times and returns the
     * min value of the rolls
     */
    public int minVal(int numRolls)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numRolls; i++)
        {
            int numRoll = roll();
            min = Math.min(min, numRoll);
        }
        return min;
    }

    public String toString() {
        return "For a " + sides + " sided die:";
    }

}