package bomberman.model;

public class Bomb {
    private int rangeExplode;
    private Position position;
    private Player player;

    private final int TIME_TO_EXPLODE = 2;

    public Bomb(Position position, int rangeExplode) {
        // Initialize bomb state here
    }

    public int getRangeExplode() {
        return rangeExplode;
    }

    public void setRangeExplode(int rangeExplode) {
        this.rangeExplode = rangeExplode;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getTIME_TO_EXPLODE() {
        return TIME_TO_EXPLODE;
    }

    public void explode() {

    }

    public void placeBomb() {
        if (player.isBombPlanted() == true) {

            this.position = player.getPosition();
        }

    }

}
