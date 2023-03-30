package bomberman.view;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class BombView extends Pane {

    private ImageView bombImage;
    private int bombSize;

    // Tạo hàm khởi tạo với các tham số
    public BombView(Image bombImage, int bombSize) {
        this.bombSize = bombSize;

        ImageView imageView = new ImageView(bombImage);
        imageView.setFitWidth(bombSize);
        imageView.setFitHeight(bombSize);

        getChildren().add(imageView);
        this.bombImage = imageView;
    }

    public ImageView getBombImage() {
        return bombImage;
    }

    public void setBombImage(ImageView imageView) {
        this.bombImage = imageView;
    }

    public int getBombSize() {
        return bombSize;
    }

    public void setBombSize(int size) {
        this.bombSize = size;
        bombImage.setFitWidth(size);
        bombImage.setFitHeight(size);
    }


    public void updatePosition(int x, int y) {
        setTranslateX(x * bombSize);
        setTranslateY(y * bombSize);
    }
}
