
package UnitTestBasics.test.blackboxtests;

import UnitTestBasics.src.blackbox.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackBoxTest {

    @Test
    public void testFizzBuzzExpectFizzWhenNumberIs3() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 3;                     // when the number is 3
        String expectedResult = "fizz";     // we expect "fizz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFizzBuzzExpectBuzzWhenNumberIs5() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 5;                    // when the number is 5
        String expectedResult = "buzz";     // we expect "buzz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFizzBuzzExpectEmptyWhenNumberIs1() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 1;                     // when the number is 1
        String expectedResult = "";         // we expect ""
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST4: Write this entire test yourself
    @Test
    public void testFizzBuzzExpectFizzBuzzWhenNumberIs15() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 15;                    // when the number is 15
        String expectedResult = "fizzbuzz"; // we expect "fizzbuzz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }

}