package bomberman.model;

public class Player {
    private int maxBombs;
    private Position position;
    private boolean isAlive;
    private boolean bombPlanted;

    public Player(int maxBombs, Position position, boolean isAlive) {
        this.maxBombs = 0;
        this.position = new Position(0, 0);
        this.isAlive = true;
        this.bombPlanted = false;
    }

    public int getMaxBombs() {
        return maxBombs;
    }

    public void setMaxBombs(int maxBombs) {
        this.maxBombs = maxBombs;
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

    public void moveUp() {

    }

    public void moveRight() {

    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void placeBomb() {
        // Place a bomb at the current position of the player
    }

    public boolean isBombPlanted() {
        return bombPlanted;
    }

    public void setBombPlanted(boolean bombPlanted) {
        this.bombPlanted = bombPlanted;
    }

}
