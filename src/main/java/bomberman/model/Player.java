package bomberman.model;

import bomberman.model.GameModel.Move;

public class Player {
    private int maxBombs;
    private Position position;
    private boolean isAlive;
    private boolean bombPlanted;

    public Player(int maxBombs, Position position, boolean isAlive) {
        this.maxBombs = maxBombs;
        this.position = position;
        this.isAlive = isAlive;
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

    public void placeBomb() {
        // Place a bomb at the current position of the player
        this.bombPlanted = true;
    }

    public boolean isBombPlanted() {
        return bombPlanted;
    }

    public void move(Move move) {
        int x = position.getX() + move.getDeltaX();
        int y = position.getY() + move.getDeltaY();
        this.setPosition(new Position(x, y));
    }
}