package design_principles.coupling.badcoupling.commoncoupling_2;

public class Game {
    static int team1Score;
    static int team2Score;

    public void increaseTeam1Score() {
        team1Score++;
    }

    public void increaseTeam2Score() {
        team2Score++;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }
}
