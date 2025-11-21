package main;

import java.awt.image.BufferedImage;



public class Tile {
    //Image to display on tile and whether tile is solid or not(determines if player can walk over it)
    private BufferedImage image;
    private boolean solid;

    public Tile(boolean solid, BufferedImage image){
        this.image = image;
        this.solid = solid;
    }
    //gets image for rendering
    public BufferedImage getImage() {
        return image;
    }
    //gets solid for collisions
    public boolean isSolid() {
        return solid;
    }
}
