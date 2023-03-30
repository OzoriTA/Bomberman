package bomberman.view;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class GameView {

    private Stage stage;
    private GridPane gridPane;
    private VBox scoreBox;
    private Pane gamePane;

    public GameView(Stage stage, int gridSize, int cellSize, Image playerImage, Image enemyImage,
            Image bombImage) {
        this.stage = stage;
        this.gridPane = new GridPane();
        this.scoreBox = new VBox();
        this.gamePane = new Pane();

        // Tạo các player view và enemy view
        PlayerView playerView = new PlayerView(playerImage, "Player");
        EnemyView enemyView = new EnemyView(enemyImage, cellSize);

        // Tạo các BombView
        BombView[][] bombViews = new BombView[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                BombView bombView = new BombView(bombImage, cellSize);
                bombViews[i][j] = bombView;
                gamePane.getChildren().add(bombView);
            }
        }

        // Thêm player view và enemy view vào gamePane
        gamePane.getChildren().addAll(playerView, enemyView);

        // Thiết lập vị trí ban đầu của player view và enemy view
        playerView.updatePosition(0, 0);
        enemyView.updatePosition(gridSize - 1, gridSize - 1);

        // Tạo các score view
        ScoreView playerScoreView = new ScoreView("Player");
        ScoreView enemyScoreView = new ScoreView("Enemy");

        // Thêm score view vào scoreBox
        scoreBox.getChildren().addAll(playerScoreView, enemyScoreView);

        // Thêm gridPane, gamePane và scoreBox vào scene
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(gridPane, gamePane, scoreBox);
        Scene scene = new Scene(stackPane);

        // Thiết lập kích thước cho gridPane
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                Pane pane = new Pane();
                pane.setPrefSize(cellSize, cellSize);
                gridPane.add(pane, i, j);
            }
        }

        // Thiết lập kích thước cho stage và hiển thị scene
        stage.setScene(scene);
        stage.setTitle("Bomberman");
        stage.setResizable(false);
        stage.sizeToScene();
        stage.show();
    }

    public void updatePosition(int x, int y) {
        x = (int) Math.random();
        y = (int) Math.random();
    }

    public void updatePlayerPosition(int x, int y) {
        PlayerView playerView = (PlayerView) gamePane.getChildren().get(0);
        playerView.updatePosition(x, y);
    }

    public void updateEnemyPosition(int x, int y) {
        EnemyView enemyView = (EnemyView) gamePane.getChildren().get(1);
        enemyView.updatePosition(x, y);
    }

    public void updateBombPosition(int x, int y, boolean isVisible) {
        BombView bombView =
                (BombView) gamePane.getChildren().get(y * gridPane.getRowCount() + x + 2);
        bombView.updatePosition(x, y);
        bombView.setVisible(isVisible);
    }

    public void updatePlayerScore(int score) {
        ScoreView playerScoreView = (ScoreView) scoreBox.getChildren().get(0);
        playerScoreView.setScore(score);
    }

    public void updateEnemyScore(int score) {
        ScoreView enemyScoreView = (ScoreView) scoreBox.getChildren().get(1);
        enemyScoreView.setScore(score);
    }
}
