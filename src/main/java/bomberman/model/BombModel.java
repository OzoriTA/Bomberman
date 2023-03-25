package bomberman.model;


import javafx.scene.image.Image;

public class BombModel {

    private int x;
    private int y; 
    private int bombSize; 
    private int timer; 
    private Image bombImage;

    // Tạo hàm khởi tạo với các tham số
    public BombModel(int x, int y, int bombSize, int timer, String imagePath) {
        // Gán giá trị cho các thuộc tính
        this.x = x;
        this.y = y;
        this.bombSize = bombSize;
        this.timer = timer;

        // Tạo ảnh cho quả bomb từ file
        bombImage = new Image(imagePath);
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

    public int getBombSize() {
        return bombSize;
    }

    public void setBombSize(int size) {
        this.bombSize = size;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public Image getBombImage() {
        return bombImage;
    }

    public void setBombImage(Image image) {
        this.bombImage = image;
    }

   

}
