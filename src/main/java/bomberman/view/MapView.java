package bomberman.view;


import bomberman.model.Map;
import bomberman.model.Position;
import bomberman.model.Tile;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MapView {

    private Map map;
    private GridPane gridPane;

    public MapView(Map map) {
        this.map = map;
        this.gridPane = new GridPane();
        drawMap();
    }

    public void drawMap() {
        gridPane.getChildren().clear();
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                Tile tile = map.getTileAt(new Position(i, j));
                Rectangle rect = new Rectangle(32, 32);

                if (tile.isWall()) {
                    rect.setFill(Color.BLACK);
                } else {
                    rect.setFill(Color.WHITE);
                    if (tile.containsPowerUp()) {
                        // Đặt màu cho ô vuông chứa PowerUp
                        rect.setFill(Color.GREEN);
                    }
                }

                gridPane.add(rect, i, j);
            }
        }
    }

    public void setTileAt(Position position, Tile tile) {
        map.setTileAt(position, tile);
        drawMap();
    }

    public void show(Stage stage) {
        Scene scene = new Scene(new Group(gridPane));
        stage.setScene(scene);
        stage.show();
    }

}
