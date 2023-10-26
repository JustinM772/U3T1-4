public class Player {


    private String name;
    private int score;
    private int streak;


    public Player(String name) {
        this.name = name;
        score = 0;
        streak = 1;
    }


    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }


    public void incrementScore() {
        score++;
    }


    public void reset() {
        score = 0;
    }
    public int getStreak() {
        return streak;
    }
    public void incrementStreak() {
        streak++;
    }
    public void resetStreak() {
        streak = 1;
    }


}
