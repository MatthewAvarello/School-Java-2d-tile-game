package main;

public class TileMap {
    private int height;
    private int width;
    int[][] map;

    public TileMap(int width, int height){
        this.width = width;
        this.height = height;
        map = new int[height][width];
    }

    public void setTileId(int x,int y,int num){
        map[x][y] = num;
    }
    
    public int getTileId(int x,int y){
        return map[y][x];
    }
}
