package main;

import java.awt.image.BufferedImage;



public class Tile {
    private BufferedImage image;
    private boolean solid;

    public Tile(boolean solid, BufferedImage image){
        this.image = image;
        this.solid = solid;
    }
    
    public BufferedImage getImage() {
        return image;
    }

    public boolean isSolid() {
        return solid;
    }
}
