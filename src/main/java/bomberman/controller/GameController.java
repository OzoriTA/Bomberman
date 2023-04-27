package bomberman.controller;

import bomberman.model.GameModel;
import bomberman.view.GameView;
import javafx.scene.input.KeyCode;

public class GameController {
    private GameModel gameModel;
    private GameView gameView;
    private InputHandler inputHandler;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
        this.inputHandler = new InputHandler(this);
    }

  

    public void handleKeyPress(KeyCode keyCode) {
        inputHandler.handleKeyPress(keyCode);
    }

    public void handleKeyRelease(KeyCode keyCode) {
        inputHandler.handleKeyRelease(keyCode);
    }

}
