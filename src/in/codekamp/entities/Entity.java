package in.codekamp.entities;

import java.awt.*;

abstract public class Entity {
    public int x;
    public int y;
//    public static int mxcar=65;
//    public static int mycar=500;
//    public static int mvel=10;
    public int xVel = 0;
    public int yVel = 0;
    public  int xAcc = 0;
    public   int yAcc = 0;
    protected int width=100;
    protected int height=100;
    public boolean isVisible = true;
    public Image image;
    private Rectangle rect = new Rectangle();

    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public  void update() {
        this.x += this.xVel;
        this.y += this.yVel;
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;

    }

    private void updateRect() {
        this.rect.setBounds(this.x, this.y, this.width, this.height);
    }

    public boolean isColliding(Entity other) {
        this.updateRect();
        other.updateRect();
        return this.rect.intersects(other.rect);
    }
}