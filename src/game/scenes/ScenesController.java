package game.scenes;

import engine.*;
import game.scenes.ExampleScene.ExampleScene;

public class ScenesController extends ScenesManager {
    @Override
    public void setup(GameEngine gc) {
        Scene gameScene = new ExampleScene();
        addScene("main", gameScene);
        setMainScene("main");
    }
}
