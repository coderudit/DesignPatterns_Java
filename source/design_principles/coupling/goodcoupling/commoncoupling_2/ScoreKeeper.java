package design_principles.coupling.goodcoupling.commoncoupling_2;

public class ScoreKeeper {
    public static void main(String[] args){
        Game game1 = new Game();
        game1.increaseTeam1Score();
        game1.increaseTeam1Score();
        game1.increaseTeam2Score();

        System.out.println("Game 1 : Team 1 score : " + game1.getTeam1Score());
        System.out.println("Game 1 : Team 2 score : " + game1.getTeam2Score());

        Game game2 = new Game();
        game2.increaseTeam1Score();

        System.out.println("Game 2 : Team 1 score : " + game2.getTeam1Score());
        System.out.println("Game 2 : Team 2 score : " + game2.getTeam2Score());

        System.out.println("Game 1 : Team 1 score : " + game1.getTeam1Score());
        System.out.println("Game 1 : Team 2 score : " + game1.getTeam2Score());

    }
}
