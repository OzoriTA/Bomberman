package bomberman.model;

public class Enemy {
    Position position;
    int numLives;

    public Enemy(Position position, int numLives) {
        this.position = position;
        this.numLives = numLives;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

}
