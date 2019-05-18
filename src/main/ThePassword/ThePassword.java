/**
 * The Password
 * <p>
 * There is a text file called password.txt and inside the file is the password.
 * <p>
 * This program will load this password from the file into a string,
 * then build a loop which asks the user to enter the password until they
 * do so correctly
 * <p>
 * Example run:
 * <p>
 * Enter Password: snake
 * Invalid Password!
 * Enter Password: testing
 * Invalid Password!
 * Enter Password: rhubarb
 * Password Accepted!
 */

package ThePassword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThePassword {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("password.txt");
        Scanner fileinput = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String password = fileinput.nextLine();
        fileinput.close();
        while (true) {
            System.out.print("Enter Password: ");
            String pw = input.nextLine();
            if (pw.equals(password)) {
                System.out.println("Congrats, password accepted");
                break;
            } else {
                System.out.println("Sorry, invalid password");
            }
        }
    }
}
