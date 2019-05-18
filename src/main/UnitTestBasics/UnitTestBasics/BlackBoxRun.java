/*

What is a unit test and why is it important? Unit tests are a means to verify 
the methods we write are correct. We do this by writing code to verify our code 
is correct. The methods we test are treated as a "Black Box" - 
we know what is should do and this verify it performs as expected.

 */
package UnitTestBasics.UnitTestBasics;

import UnitTestBasics.blackbox.BlackBox;

import java.util.Scanner;

public class BlackBoxRun {

    public static void main(String[] args) {
        BlackBox b = new BlackBox();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.printf("Number %d ==> %s\n", number, b.FizzBuzz(number));
    }
}
