package screens;

import in.codekamp.entities.Entity;
import in.codekamp.GamePanel;

import java.awt.*;
import java.util.ArrayList;

abstract public class Screen {

    protected GamePanel  gPanel;
    protected java.util.List<Entity> entities = new ArrayList<>();

    public Screen(GamePanel p) {
        super();
        this.gPanel = p;
    }


    public void update() {
        for(Entity e: this.entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for(Entity e: entities) {
            if(e.isVisible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }
    }

    public void onMousePress(int xCord, int yCord) {

    }

    public void onKeyPress(int keyCode) {

    }
}