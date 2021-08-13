package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");}
        // ternary operator takes three operands
        // the first operand is what we are testing, which should evaluate to true or false
        // the second operand is the value to assign to the variable if the first operand was true.
        // the third operand is the value to assign to the variable if the first operand was false.

    }
}
