package HelloExamples.InteractiveHello;

import java.util.Scanner;

/**
 * @author navdeepgill
 */
public class InteractiveHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make new object of class Scanner, based on System.in and call it input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ==> ");
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!!!\n", yourName); // say hello
    }
}