package method.com;

public class demo {
    public static void main(String[] args) {

int finalScore = calculateScore(true,800,5,100);
        System.out.println("final score is " + finalScore );


finalScore= calculateScore(false,10000,5,200);
        System.out.println("final score is " + finalScore );


    }



        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
}
