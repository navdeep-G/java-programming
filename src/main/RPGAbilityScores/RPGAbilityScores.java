/**
 * Roll ability scores for an RPG
 * <p>
 * Role a die a specific number of times. This is often
 * required when rolling ability scores for an RPG (Role-playing game)
 * <p>
 * Overload the roll() method of the Die.java class to accept a
 * parameter for the number of times the Die needs to be rolled. Inside the method
 * use a for loop to roll the die that many times. For example:
 * <p>
 * Die d6 = new Die(6);
 * int Strength= d6.roll(3);  // Roll a 6 sided die three times.
 * <p>
 * main() method here roll's out a character's abilities, which should roll a six sided die
 * three times for each ability :
 * (there are 6 abilities: str, int, dex, con, wis, cha)
 * <p>
 * EXAMPLE OUTPUT (using seed = 5555 for the die):
 * <p>
 * Character Roll:
 * Str Int Dex Con Wis Cha
 * 11  17  10  10  13  12
 */
package RPGAbilityScores;

public class RPGAbilityScores {

    public static void main(String[] args) {
        Die d6 = new Die(6, 5555);    // 6 sided-die with seed 5555
        System.out.printf("Character Ability Roll:\n");
        System.out.printf("Str Int Dex Con Wis Cha\n");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%3d ", d6.roll(3));
        }
        System.out.println();
    }
}

