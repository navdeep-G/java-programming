package StringBuilderExample;

public class StringBuilderExample {

    public static void main(String[] args) {
        // demonstrates StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append("ArrA");
        String fward = sb.toString();
        String bward = sb.toString();

        //Print out strings
        System.out.println(fward);
        System.out.println(bward);

        //Comparing strings
        System.out.println(fward == bward); //Returns False as this compares if they are the same object
        System.out.println(fward.equals(bward)); //Returns True as this compare if they are logically equal

        //Compare to see if it is a palindrome for funsies
        if (fward.equals(bward)) {
            System.out.print("We got a palindrome. " + fward + " equals " + bward);
        } else {
            System.out.print("Not a palindrome. " + fward + " does not equal " + bward);
        }
    }
}