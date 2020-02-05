package game.scenes.ExampleScene;

import engine.GameEngine;
import engine.Renderer;
import engine.Scene;
import engine.gfx.Sprite;
import engine.gfx.Vector2;
import engine.objects.GameObject;

public class ExampleGameObject extends GameObject {
    public ExampleGameObject(Scene scene, Vector2 position) {
        super(scene, position);
    }
    Sprite ship1;
    Sprite ship2;
    @Override
    public void setup(GameEngine gc) {

        ship1 = new Sprite("/images/ship1.png", new Vector2(100, 400));
        ship2 = new Sprite("/images/ship2.png", new Vector2(300, 400));
    }
    float angle = 0f;
    @Override
    public void update(GameEngine gc, float dt) {
        ship1.rotate((int)angle);
        ship2.rotate((int)angle);
        angle+=0.2f;
    }

    @Override
    public void render(GameEngine gc, Renderer r) {
        r.drawImage(ship1);
        r.drawImage(ship2);
    }
}
