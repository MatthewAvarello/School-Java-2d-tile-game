package main;

public class TileMap {
    //Due to the map being just straight height and width it has to either be a rectangle or square
    private int height;//height of tile map
    private int width;//width of tile map
    int[][] map;//where the numbers that represent the tiles are stored

    public TileMap(int width, int height){//Get width and height to make a tilemap
        this.width = width;
        this.height = height;
        map = new int[height][width];
    }

    //Sets tile number in map array
    public void setTileId(int x,int y,int num){
        map[x][y] = num;
    }
    
    //Gets tile number in map array
    public int getTileId(int x,int y){
        return map[y][x];
    }

    //returns height
    public int getHeight(){
        return height;
    }

    //returns width
    public int getWidth(){
        return width;
    }
}
