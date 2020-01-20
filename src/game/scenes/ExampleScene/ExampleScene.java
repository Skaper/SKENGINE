package game.scenes.ExampleScene;

import engine.*;
import engine.gfx.IColor;
import engine.DefaultCamera;


public class ExampleScene extends Scene {
    //Пустая сцена
    @Override
    public void setup(GameEngine gc) {
        gc.setMainCamera(new DefaultCamera(null)); //Tag of target gameObject


    }

    @Override
    public void update(GameEngine gc, float dt) {

    }

    @Override
    public void render(GameEngine gc, Renderer r) {
        //Вывод справочной информации
        r.drawText(ResourceLoader.getInfo("ru"), 5, 40, 3f, IColor.WHITE);
    }
}
