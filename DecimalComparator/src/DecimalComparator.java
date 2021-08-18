public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {

        int num1Whole = (int) (num1 * 1000);
        int num2Whole = (int) (num2 * 1000);
        return num1Whole == num2Whole;
    }
}
