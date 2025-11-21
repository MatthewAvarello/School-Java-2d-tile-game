package main;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
public class TileManager {
    //Sets constants for each tile to be represented on tile map(Did not have enough times for all tiles)
    //static as this class is really just data
    public static final int TILE_NUM_WATER = 0; 
    public static final int TILE_NUM_GRASS = 1; 
    public static final int TILE_NUM_DIRT = 2; 
    //array for tiles to be stored
    public static Tile[] tiles;


    public static void initializeTiles() {
        tiles = new Tile[Constants.AMOUNT_OF_TILES];
        //wrapped in a try catch block in case images dont load
        try {
            //Get file paths
            Path waterPath = Paths.get("src/resources/tiles/Water.png");
            Path grassPath = Paths.get("src/resources/tiles/Grass.png");
            Path dirtPath  = Paths.get("src/resources/tiles/Dirt.png");
            
            //use file paths to load a image
            BufferedImage waterImage = ImageIO.read(waterPath.toFile());
            BufferedImage grassImage = ImageIO.read(grassPath.toFile());
            BufferedImage dirtImage = ImageIO.read(dirtPath.toFile());

            //make the tiles with the image, solid attribute and uses constants to choose where its placed in array
            tiles[TILE_NUM_WATER] = new Tile(false, waterImage);
            tiles[TILE_NUM_GRASS] = new Tile(true, grassImage);
            tiles[TILE_NUM_DIRT] = new Tile(true, dirtImage);

        } catch (IOException error) { //logs error to console
            System.out.println(error.getMessage());
            System.out.println("Error 404: Image not found");
        }
    }
}
