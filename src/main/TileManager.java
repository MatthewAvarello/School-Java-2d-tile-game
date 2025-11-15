package main;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
public class TileManager {

    public static final int TILE_NUM_WATER = 0; 
    public static final int TILE_NUM_GRASS = 1; 
    public static final int TILE_NUM_DIRT = 2; 

    public static Tile[] tiles;

    public static void initializeTiles() {
        tiles = new Tile[3];
        try {
            Path waterPath = Paths.get("src/resources/tiles/Water.png");
            Path grassPath = Paths.get("src/resources/tiles/Grass.png");
            Path dirtPath  = Paths.get("src/resources/tiles/Dirt.png");
        
            BufferedImage waterImage = ImageIO.read(waterPath.toFile());
            BufferedImage grassImage = ImageIO.read(grassPath.toFile());
            BufferedImage dirtImage = ImageIO.read(dirtPath.toFile());

            tiles[TILE_NUM_WATER] = new Tile(false, waterImage);
            tiles[TILE_NUM_GRASS] = new Tile(true, grassImage);
            tiles[TILE_NUM_DIRT] = new Tile(true, dirtImage);

            System.out.println();

        } catch (IOException error) {
            System.out.println(error.getMessage());
            System.out.println("ERROR");
        }
    }
}
