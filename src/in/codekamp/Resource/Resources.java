package in.codekamp.Resource;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Resources {
  public static BufferedImage carImage=null;
    public static BufferedImage cars1;
    public static BufferedImage cars2;
    public static BufferedImage cars3;
    public static BufferedImage cars4;
    public static  BufferedImage block=null;
    public static AudioClip hitAudio;
    public static BufferedImage menuImage;
    public static void load(){

        try {

            carImage=ImageIO.read(Resources.class.getResource("Resources/p1.jpg"));
            block=ImageIO.read(Resources.class.getResource("Resources/block.png"));
            cars1=ImageIO.read(Resources.class.getResource("Resources/p4.jpg"));
            cars2=ImageIO.read(Resources.class.getResource("Resources/p2.jpg"));
            cars3=ImageIO.read(Resources.class.getResource("Resources/p3.jpg"));
            cars4=ImageIO.read(Resources.class.getResource("Resources/p5.jpg"));
            menuImage=ImageIO.read(Resources.class.getResource("Resources/menu.png"));
            hitAudio= Applet.newAudioClip(Resources.class.getResource("Resources/hit.wav"));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
