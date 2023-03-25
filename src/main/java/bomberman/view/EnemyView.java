package bomberman.view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

// Tạo class EnemyView kế thừa từ Pane
public class EnemyView extends Pane {

    // Khai báo các thuộc tính
    private ImageView imageView; // Đối tượng hiển thị ảnh của kẻ địch
    private int size; // Kích thước của kẻ địch

    // Tạo hàm khởi tạo với các tham số
    public EnemyView(Image image, int size) {
        // Gán giá trị cho các thuộc tính
        this.size = size;

        // Tạo đối tượng hiển thị ảnh và thiết lập kích thước
        imageView = new ImageView(image);
        imageView.setFitWidth(size);
        imageView.setFitHeight(size);

        // Thêm đối tượng hiển thị ảnh vào Pane
        getChildren().add(imageView);
    }

    // Tạo các phương thức getter và setter cho các thuộc tính

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        imageView.setFitWidth(size); // Cập nhật kích thước của ảnh khi thay đổi size
        imageView.setFitHeight(size);
    }

    // Tạo phương thức để cập nhật vị trí của kẻ địch trên màn hình theo dữ liệu từ model

    public void updatePosition(int x, int y) {
        setTranslateX(x * size); // Cập nhật vị trí theo tọa độ x
        setTranslateY(y * size); // Cập nhật vị trí theo tọa độ y
    }
}
