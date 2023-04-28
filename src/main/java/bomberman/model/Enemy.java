package bomberman.model;

import javafx.scene.canvas.GraphicsContext;

public class Enemy {
    private Position position;
    private boolean isAlive;

    public Enemy(Position position, boolean isAlive) {
        this.position = position;
        this.isAlive = true;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void move(Position pos, GraphicsContext gcgc) {
    }

}
