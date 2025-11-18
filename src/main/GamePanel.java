package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.black);
        for(int i = 1; i < 5; i++){
            System.out.println("test");
            //g.fillRect(i * 16, i * 16, 16 + i, 16 - i);
            g.drawImage(TileManager.tiles[0].getImage(), i * 16, 1, getFocusCycleRootAncestor());
        }
        
    }
}
