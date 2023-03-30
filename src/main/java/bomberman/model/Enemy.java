package bomberman.model;

import javafx.scene.image.Image;

public class Enemy {

    // Khai báo các thuộc tính
    private int x; // Tọa độ x của kẻ địch trên bản đồ
    private int y; // Tọa độ y của kẻ địch trên bản đồ
    private int size; // Kích thước của kẻ địch
    private int speed; // Tốc độ di chuyển của kẻ địch
    private Image image; // Ảnh của kẻ địch

    // Tạo hàm khởi tạo với các tham số
    public Enemy(int x, int y, int size, int speed, String imagePath) {
        // Gán giá trị cho các thuộc tính
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;

        // Tạo ảnh cho kẻ địch từ file
        image = new Image(imagePath);
    }

    // Tạo các phương thức getter và setter cho các thuộc tính

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
