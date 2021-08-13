package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float maximum value = " + myMaxFloatValue);
        System.out.println("Float minimum value = " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        System.out.println("Double minimum value = " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Challenge:
        // 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
        double weightInPounds = 200d;

        // 2. Calc the result (e.g. number of kgs based on the pounds) and store the result in a second variable
        double weightInKilograms = weightInPounds * 0.45359237d;
        // 3. Print out the result
        System.out.println(weightInKilograms);

    }
}
