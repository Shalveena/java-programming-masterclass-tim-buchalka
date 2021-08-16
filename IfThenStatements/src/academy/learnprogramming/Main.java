package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // && AND operators

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // || Or operators
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (isCar != true) {
            System.out.println("This is not supposed to happen!");
        }

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(("Your final score was " + finalScore));
        }

        

    }
}
