package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Challenge

        // Create a byte variable and set it to any valid byte number
        byte byteVariable = 2;

        // Create a short variable and set it to any valid short number
        short shortVariable = 3;

        // Create an int variable and set it to any valid int number
        int intVariable = 5;

        // Create a variable with the type of long and make it equal to 50,000 plus 10 times
        // the sum of the byte plus the short plus the integer values.
        long longVariable = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        System.out.println(longVariable);

        short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));
    }
}
