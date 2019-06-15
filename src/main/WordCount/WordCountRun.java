/*
 * This program simply counts the words in the data.txt input file. 
 * 
 * SAMPLE OUTPUT: 
 * 
...
this
Constitution
for
the
United
States
of
America.
Word Count: 52
*/

package WordCount;

import java.io.File;
import java.util.Scanner;

public class WordCountRun {

    public static void main(String[] args) {
        String word;
        int wordCount = 0;
        try {
            File file = new File("data.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                word = input.next();
                System.out.println(word);
                wordCount++;
            }
            System.out.printf("Word Count: %d\n",wordCount);
        } catch (Exception e) {
            System.out.printf("ERROR: %s\n", e);
        }

    }
}
