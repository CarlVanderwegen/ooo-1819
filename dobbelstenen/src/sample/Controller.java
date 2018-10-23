package sample;

public class Controller {
<<<<<<< HEAD
    public Controller() {
        PlayerView pv3 = new PlayerView(3);
        PlayerView pv2 = new PlayerView(2);
        PlayerView pv1 = new PlayerView(1);
        ScoreView scoreview = new ScoreView();
        Game game = new Game();

        pv1.isAanBeurt(true);

        game.registerObserver(pv3);
        game.registerObserver(pv2);
        game.registerObserver(pv1);

        game.registerObserver(scoreview);
    }
=======
>>>>>>> parent of 84a305d... einde les
}
