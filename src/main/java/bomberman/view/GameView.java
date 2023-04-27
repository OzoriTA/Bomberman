package bomberman.view;


import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class GameView {
    private Scene scene;
    private Pane root;
    private MapView mapView;
    private PlayerView playerView;
    private List<EnemyView> enemyViews;
    private List<BombView> bombViews;
    private Label scoreLabel;

    public GameView() {
    }

    
}