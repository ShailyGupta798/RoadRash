package screens;

import in.codekamp.GamePanel;
import in.codekamp.entities.Cars;
import in.codekamp.entities.Entity;
import in.codekamp.entities.MainCar;
import jdk.nashorn.internal.ir.Block;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Stage1Screen extends Screen{
    private  java.util.List<Cars> car = new ArrayList<>();
    private MainCar player;


    public Stage1Screen(GamePanel panel) {
        super(panel);
//        this.player = new MainCar(50, 50);
        this.car.add(new Cars(130, 50));
        this.car.add(new Cars(240, -100));
        this.car.add(new Cars(330, -200));


        this.player = new MainCar(130, 300);
        this.entities.addAll(this.car);
        this.entities.add(this.player);



    }

    @Override
    public void update() {
        super.update();
        for (Cars c : car){
            if (c.y > 600){
                c.y = 100;
            }


                if (c.isColliding(this.player)) {
                    // Resource.hitAudio.play();
                    this.gPanel.currentScreen = new GameOverScreen(this.gPanel);

                }
            }
        }





    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,30,600);
        g.fillRect(480,0,30,600);

        g.setColor(Color.BLUE);
        g.fillRect(30,0,150,650);
        g.setColor(Color.BLACK);
        g.fillRect(180,0,150,650);
        g.setColor(Color.RED);
        g.fillRect(330,0,150,650);
        super.draw(g);


    }

   @Override
    public void onKeyPress(int keyCode) {
        if(keyCode==KeyEvent.VK_RIGHT){
            this.player.x=this.player.x+150;

        }
        if(keyCode==KeyEvent.VK_LEFT){
          // Entity.mxcar=Entity.mxcar-150;
            this.player.x=this.player.x-150;
        }
        if(keyCode==KeyEvent.VK_UP){
           // Entity.mycar=Entity.mycar-Entity.mvel;
            this.player.y=this.player.y-6;


        }
        if(keyCode==KeyEvent.VK_DOWN){
          //  Entity.mycar=Entity.mycar-Entity.mvel;
            this.player.y=this.player.y+6;

        }
    }


}
