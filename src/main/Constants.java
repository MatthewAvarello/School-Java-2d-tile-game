package main;

public class Constants {
    public static final int TILE_SIZE = 16; //pixels on each side of square tile
    public static final int SCALE = 3;// scale factor so squares are not tiny
    public static final int SCALED_TILE_SIZE = TILE_SIZE * SCALE; 
    public static final int SCREEN_WIDTH = 800;//Ideal screen width if user does not expand screen
    public static final int SCREEN_HEIGHT = 600;//Ideal screen height if user does not expand screen
    public static final int AMOUNT_OF_TILES = 8;//How much space to make for the drawings
    public static final int MILLISECONDS_PER_REFRESH = 16; //how many milliseconds java waits before redoing game loop calculations(essentially sets frame rate to roughly 60)
}
