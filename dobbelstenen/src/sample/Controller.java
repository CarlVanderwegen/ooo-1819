package sample;

import model.Game;
import view.PlayerView;
import view.ScoreView;

public class Controller {
    public Controller() {
        PlayerView pv3 = new PlayerView(3);
        PlayerView pv2 = new PlayerView(2);
        PlayerView pv1 = new PlayerView(1);
        ScoreView scoreview = new ScoreView();
        Game game = new Game();

        game.registerObserver(pv3);
        game.registerObserver(pv2);
        game.registerObserver(pv1);

        game.registerObserver(scoreview);
    }
}
