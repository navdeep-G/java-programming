package CommonDataTypes.BoolExample;

/**
 * @author navdeepgill
 */
public class Bool {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        //Control if statement with boolean
        if (b) {
            System.out.println("This is exectued");
        }

        b = false;
        if (b) {
            System.out.println("This is not exectued");
        }

        //Outcome of a relational operator
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
