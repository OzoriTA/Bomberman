package bomberman.controller;

import java.util.HashMap;

import bomberman.model.*;
import javafx.scene.input.KeyCode;

public class InputHandler {
    private GameController gameController;
    private HashMap<KeyCode, Boolean> keyState;
    GameModel gameModel;

    public InputHandler(GameController gameController) {
        this.gameController = gameController;
        this.keyState = new HashMap<>();

        keyState.put(KeyCode.UP, false);
        keyState.put(KeyCode.DOWN, false);
        keyState.put(KeyCode.LEFT, false);
        keyState.put(KeyCode.RIGHT, false);
        keyState.put(KeyCode.SPACE, false);
    }

    public void handleKeyPress(KeyCode keyCode) {
        keyState.put(keyCode, true);

        updateGameController();
    }

    public void handleKeyRelease(KeyCode keyCode) {
        keyState.put(keyCode, false);

        updateGameController();
    }

    private void updateGameController() {
        if (keyState.get(KeyCode.UP)) {
            gameModel.movePlayer(1);
        }
        if (keyState.get(KeyCode.DOWN)) {
            gameModel.movePlayer(2);
        }
        if (keyState.get(KeyCode.LEFT)) {
            gameModel.movePlayer(3);
        }
        if (keyState.get(KeyCode.RIGHT)) {
            gameModel.movePlayer(4);
        }
        if (keyState.get(KeyCode.SPACE)) {
            gameModel.placeBomb();
        }
    }
}
