package bomberman.model;

import java.util.List;

public class GameModel {
    private int score;
    private int remainingEnemies;
    private Player player;
    private List<Enemy> enemies;
    private Map map;
    private List<Bomb> bombs;

    public GameModel() {
        // Initialize game state here
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRemainingEnemies() {
        return remainingEnemies;
    }

    public void setRemainingEnemies(int remainingEnemies) {
        this.remainingEnemies = remainingEnemies;
    }

    public boolean isGameOver() {

        if (!player.isAlive()) {
            return false;

        }
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(List<Bomb> bombs) {
        this.bombs = bombs;
    }

    public void updateGameState() {
        // Update the state of the game here
    }

    public void update(long currentTime) {
    }

    public Object getState() {
        return null;
    }

    public void movePlayer(int i) {
        if (i == 1) {
            player.move(Move.UP);

        }
        if (i == 2) {
            player.move(Move.DOWN);
        }
        if (i == 3) {
            player.move(Move.LEFT);

        }
        if (i == 4) {
            player.move(Move.RIGHT);

        }

    }

    public void placeBomb() {
        player.placeBomb();
    }

    public enum Move {
        UP(0, -1),
        RIGHT(1, 0),
        DOWN(0, 1),
        LEFT(-1, 0);

        private final int deltaX;
        private final int deltaY;

        Move(final int deltaX, final int deltaY) {
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }

        public int getDeltaX() {
            return deltaX;
        }

        public int getDeltaY() {
            return deltaY;
        }
    }
}
