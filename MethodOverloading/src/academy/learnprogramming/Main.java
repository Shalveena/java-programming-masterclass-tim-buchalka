package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Example of Method overloading ///////////////////////////////////////////

//       int newScore = calculateScore("Shally", 500);
//       System.out.println("New score is " + newScore);
//
//       calculateScore(75);
//
//       calculateScore();

        // Challenge: Feet and Inches to Centimeters /////////////////////////////

//        System.out.println(calcFeetAndInchesToCentimeters(165));

        // Challenge: Seconds and Minutes /////////////////////////////////////
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    // Challenge: Seconds and Minutes to hours ///////////////////////////////////////

    // First method, with two parameters: minutes and seconds

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) return "Invalid value";

        // 1. Find out how many hours in the minutes
        int hours = minutes / 60;
        String hoursInDoubleDigits = (hours < 10 ? "0" : "") + hours;

        // 2. Remaining minutes will be the minutes left over - can display it.
        int remainingMinutes = minutes % 60;
        String remainingMinInDoubleDigits = (remainingMinutes < 10 ? "0" : "") + remainingMinutes;

        // Change seconds so that it is in double digits
        String secInDoubleDigits = (seconds < 10 ? "0" : "") + seconds;

        // Return hours, remaining minutes and seconds in a string.
        return (minutes + " minutes " + seconds + " seconds is = "
                + hoursInDoubleDigits + "h "
                + remainingMinInDoubleDigits + "m "
                + secInDoubleDigits + "s")
        ;
    }

    // Second method, with only one parameter: seconds
    public static String getDurationString (int seconds) {

        if (seconds < 0) return "Invalid value";

        // 1. Change seconds to minutes
        int minutes = seconds / 60;

        // 2. Capture the leftover seconds
        int remainingSecs = seconds % 60;

        // 3. Call the first method and pass it the minutes and leftover seconds
        return getDurationString(minutes, remainingSecs);
    }

    // Challenge: Feet and Inches to Centimeters /////////////////////////////////////

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if (feet < 0 ) {
            return -1;
        }
        if (inches < 0 || inches > 12){
            return -1;
        }

        double totalInches = (feet * 12d) + inches;
        return totalInches * 2.54d; // centimeters

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if (inches < 0) {
            return -1;
        }

        double feetComponent = (double) ((int) inches / 12);
        double inchesComponent = inches % 12;

        return calcFeetAndInchesToCentimeters(feetComponent, inchesComponent);
    }

    // Example of Method Overloading /////////////////////////////////////////////
    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
