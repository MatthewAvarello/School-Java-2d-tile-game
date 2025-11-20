package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TileManager.initializeTiles();
        JFrame game = new JFrame("My 2d Pixel Game!");
        GamePanel panel = new GamePanel();
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        game.add(panel);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
