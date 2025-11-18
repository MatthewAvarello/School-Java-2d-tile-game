package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.black);
        g.fillRect(ALLBITS, ABORT, 136, 16);
    }
}
