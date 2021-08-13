package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 1. Create a double variable with a value of 20.00
        double num1 = 20.00d;

        // 2. Create a second variable of type double with the value of 80.00
        double num2 = 80.00d;

        // 3. Add both numbers together and multiply by 100.00
        double sumMultiplied = (num1 + num2) * 100.00d;
        System.out.println("(20 + 80) * 100 = " + sumMultiplied);

        // 4. use the remainder operator to figure out what the remainder from the result of the operation
        // in set 3 and 40.00 is.
        double remainderNum = sumMultiplied % 40.00d;
        System.out.println("10,000 divided by 40 gives a remainder of: " + remainderNum );

        // 5. Create a boolean variable that assigns the value true if the remainder at step 4 is 0, or
        // false if it is not 0
        boolean isRemainderZero = (remainderNum == 0.00d) ? true : false;

        // 6. Output the boolean variable
        System.out.println("Is the remainder zero? " + isRemainderZero);

        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in
        // step 5 is not true.
        if (!isRemainderZero) {
            System.out.println("Got some remainder");

        }

    }
}
