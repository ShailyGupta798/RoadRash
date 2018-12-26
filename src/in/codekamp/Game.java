package in.codekamp;

import javax.swing.*;

public class Game {
    public static final int GAME_HEIGHT = 600;
    public static final int GAME_WIDTH = 550;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
