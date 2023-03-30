package bomberman.model;


// Import các thư viện cần thiết
import javafx.scene.image.Image;

// Tạo class MapModel để lưu trữ các thuộc tính và phương thức của bản đồ
public class Map {

    // Khai báo các thuộc tính
    private int width; // Chiều rộng của bản đồ
    private int height; // Chiều cao của bản đồ
    private Image image; // Ảnh của bản đồ

    // Tạo hàm khởi tạo với các tham số
    public Map(int width, int height, String imagePath) {
        // Gán giá trị cho các thuộc tính
        this.width = width;
        this.height = height;

        // Tạo ảnh cho bản đồ từ file
        image = new Image(imagePath);
    }

    // Tạo các phương thức getter và setter cho các thuộc tính

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
