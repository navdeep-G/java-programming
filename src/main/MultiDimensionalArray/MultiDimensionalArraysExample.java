/*
 * This demonstrates multi-dimensional arrays in Java.
 * These structures are useful for representing real-world structures such
 * as game-boards and maps.
 */
package MultiDimensionalArray;

public class MultiDimensionalArraysExample {
/* 
X| | 
-+-+-
 |W|O
-+-+-
X| |O
*/

    public static void main(String[] args) {
        char[][] board = new char[3][3];    // tic-tac-toe board
        board[0][0] = 'X';                  // place an X in upper-left
        board[1][2] = 'O';                  // place an O in row 1 col 2
        board[2][0] = 'X';                  // place an X in row 2 col 0
        board[2][2] = 'O';                  // place an O in row 2 col 0
        board[1][1] = 'W';                  // place an W in row 1 col 1

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]=%s ", i, j, board[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
