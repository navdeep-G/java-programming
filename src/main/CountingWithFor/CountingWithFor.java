/**
 * Counting with a for loop
 * <p>
 * Ua for loop to roll a die 5000 times and count
 * the number of times a 1 comes up on the die. This is a fairly common practice
 * in "data processing" style computer programs.
 * <p>
 * Do this 5000 times
 * roll a die
 * if it comes up 1 then increase the count
 * <p>
 * After the loop is over display the number of rolls, count of 1's and
 * percentage of rolls which came up 1. (Should be close to 0.167)
 */
package CountingWithFor;

public class CountingWithFor {

    public static void main(String[] args) {
        int count = 0;
        int trials = 5000;
        Die d = new Die(6);

        for (int i = 0; i < trials; i++) {
            if (d.roll() == 1) {
                count++;
            }
        }

        System.out.printf("Trials: %d\n", trials);
        System.out.printf("Number of 1's: %d\n", count);
        System.out.printf("Percentage: %.3f\n", count / (double) trials);

    }
}
