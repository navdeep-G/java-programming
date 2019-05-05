
package PlayingCardsExample.playingcardsrun;

import java.util.Random;
import PlayingCardsExample.playingcards.*;

/**
 *
 * @author navdeepgill
 */
public class PlayingCardsRun {

    public static void main(String[] args) {
        Random gen = new Random();
        Card c1 = new Card(Ranks.ACE,Suits.HEARTS);
        Card c2 = new Card(gen.nextInt(52));
        
        System.out.printf("Cards: %s %s\n",c1.toString(),c2.toString());
        System.out.printf("SAME RANK : %s\n", c1.sameRank(c2));
        System.out.printf("SAME SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("SAME CARD : %s\n", c1.sameCard(c2));
    }
}
