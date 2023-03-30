package bomberman.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class PlayerView extends VBox {
    private ImageView playerImage;
    private Label playerName;

    public PlayerView(Image image, String name) {
        playerImage = new ImageView(image);
        playerName = new Label(name);

        getChildren().addAll(playerImage, playerName);
        setAlignment(Pos.CENTER);
        setSpacing(10);
    }

    public ImageView getPlayerImage() {
        return playerImage;
    }

    public Label getPlayerName() {
        return playerName;
    }

    public void setPlayerImage(Image image) {
        playerImage.setImage(image);
    }

    public void setPlayerName(String name) {
        playerName.setText(name);
    }
}
