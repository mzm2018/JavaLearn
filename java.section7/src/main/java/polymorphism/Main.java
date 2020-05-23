package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark is eating a lot of people";
    }
}
class IndependentDay extends Movie{
    public IndependentDay() {
        super("IndependentDay");
    }
    public String plot() {
        return "Alien attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "kids try and escape a maze";
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++) {
            Movie movie = randomMovie();
            System.out.println("Movie#" + i + " : " + movie.getName() + "\n" + "Plot " + movie.plot()+ "\n");
        }

    }
    public static Movie randomMovie() {
        int randomNumber= (int) (Math.random() * 3) +1;
        System.out.println("Random number generated was: "+ randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependentDay();
            case 3:
                return new MazeRunner();
        }
        return null;
    }

}
