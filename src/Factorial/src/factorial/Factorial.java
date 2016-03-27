package Factorial.src.factorial;

public class Factorial {

    public static void main(String[] args) {
        int n = 10;
        int result = factorial(n);
        System.out.printf("%d factorial is %d\n", n,result);
    }
    
    /*
     * Calculates the factorial of a positive integer n
     * Example factorial(4) == 4*3*2*1 == 24
     * Below implementation makes use of recursion, i.e., factorial(n) = n * factorial(n-1)
     */

    public static int factorial( int n ) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
