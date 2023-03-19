import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// Tạo một lớp kế thừa từ Application
public class BomberMap extends Application {

    // Khai báo các hằng số cho kích thước của bản đồ và ô vuông
    public static final int ROWS = 10; // Số hàng của bản đồ
    public static final int COLS = 10; // Số cột của bản đồ
    public static final int SIZE = 50; // Kích thước của mỗi ô vuông (pixel)

    // Khai báo một mảng hai chiều để lưu trữ trạng thái của các ô vuông
    // 0: ô trống, 1: ô có bom, 2: ô có người chơi
    private int[][] map;

    // Khai báo một GridPane để hiển thị các ô vuông
    private GridPane grid;

    // Phương thức khởi tạo để tạo ra một bản đồ ngẫu nhiên
    public BomberMap() {
        // Tạo một mảng hai chiều với kích thước ROWS x COLS
        map = new int[ROWS][COLS];

        // Duyệt qua từng phần tử của mảng và gán giá trị ngẫu nhiên cho nó
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Xác suất để một ô có bom là 20%
                if (Math.random() < 0.2) {
                    map[i][j] = 1; // Gán giá trị 1 cho ô có bom
                } else {
                    map[i][j] = 0; // Gán giá trị 0 cho ô trống
                }
            }
        }

        // Đặt người chơi vào vị trí ngẫu nhiên trên bản đồ
        int x = (int) (Math.random() * ROWS); // Tọa độ x ngẫu nhiên
        int y = (int) (Math.random() * COLS); // Tọa độ y ngẫu nhiên

        // Đảm bảo rằng vị trí của người chơi không phải là ô có bom
        while (map[x][y] == 1) {
            x = (int) (Math.random() * ROWS);
            y = (int) (Math.random() * COLS);
        }

        map[x][y] = 2; // Gán giá trị 2 cho ô có người chơi

        // Tạo một GridPane với kích thước ROWS x COLS và khoảng cách giữa các ô là 0 pixel
        grid = new GridPane();
        grid.setHgap(0);
        grid.setVgap(0);

        // Duyệt qua từng phần tử của mảng và tạo ra các Rectangle để hiển thị các ô vuông trên
        // GridPane
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                Rectangle rect = new Rectangle(SIZE, SIZE); // Tạo một Rectangle
                // Đặt màu cho Rectangle dựa vào giá trị của mảng
                if (map[i][j] == 0) {
                    rect.setFill(Color.WHITE); // Ô trống có màu trắng
                } else if (map[i][j] == 1) {
                    rect.setFill(Color.RED); // Ô có bom có màu đỏ
                } else if (map[i][j] == 2) {
                    rect.setFill(Color.GREEN); // Ô có người chơi có màu xanh lá
                }

                // Thêm Rectangle vào GridPane ở vị trí tương ứng
                grid.add(rect, j, i);
            }
        }
    }

    // Phương thức start để khởi chạy ứng dụng
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Tạo một Scene với GridPane làm root node và kích thước là COLS x SIZE x ROWS x SIZE pixel
        Scene scene = new Scene(grid, COLS * SIZE, ROWS * SIZE);

        // Đặt tiêu đề cho Stage
        primaryStage.setTitle("Bomber Map");

        // Đặt Scene cho Stage
        primaryStage.setScene(scene);

        // Hiển thị Stage
        primaryStage.show();
    }

    // Phương thức main để chạy ứng dụng
    public static void main(String[] args) {
        launch(args);
    }
}