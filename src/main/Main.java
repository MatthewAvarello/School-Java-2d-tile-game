package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame game = new JFrame("My 2d Pixel Game!");
        GamePanel panel = new GamePanel();
        game.add(panel);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(640,640);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
