package main;

public class Constants {
    public static final int TILE_SIZE = 16;
    public static final int SCALE = 3;            // scale factor
    public static final int SCALED_TILE_SIZE = TILE_SIZE * SCALE;
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final int AMOUNT_OF_TILES = 8;
    public static final int MILLISECONDS_PER_REFRESH = 16; //how many milliseconds java waits before redoing game loop calculations(essentially sets frame rate to roughly 60)
}
