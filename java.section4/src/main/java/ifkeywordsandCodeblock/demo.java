package ifkeywordsandCodeblock;

public class demo {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted= 5;
        int bonus = 100;

        if (score <5000 && score > 1000) {
            System.out.println("Your Score is less than 500 but greater than 1000");
        }  else if (score < 1000) {
                System.out.println("Your Score is less than 1000");
            } else {
            System.out.println("You Got here");
        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score is " + finalScore);
        }
        score = 10000;
        levelCompleted= 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score is " + finalScore);
        }

    }
}
