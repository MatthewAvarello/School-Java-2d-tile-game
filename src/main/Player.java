package main;

import java.awt.event.KeyEvent;

public class Player {
    public int worldX, worldY;//Represents where the player is in the world
    private int speed = 4;//Pixels player moves every game loop
    private boolean up, down, left, right;//Declares the players possible movement directions

    public Player(int x, int y) {//Constructor allows player to be placed in a certain area in world
        worldX = x;
        worldY = y;
    }

    public void update(TileMap map) {//Tilemap from ganepanel
        //represents cordinate of where player wants to move to next
        int nextX = worldX;
        int nextY = worldY;

        //changes where player wants to be next based off the button they press
        if (up){
            nextY -= speed;
            System.out.println("up true");
        } else if (down) {
            nextY += speed;
        } else if (right) {
            nextX -= speed;
        } else if (left){
            nextX += speed;
        }

        //cordinates on tile map where player wants to move. it is int as a place in tile map array cant be a decimal
        int tileX = nextX / Constants.SCALED_TILE_SIZE;
        int tileY = nextY / Constants.SCALED_TILE_SIZE;

        //If not on edge of world
        if (tileX >= 0 && tileY >= 0 && tileX < map.getWidth() && tileY < map.getHeight()) {
            System.out.println("In");
            int tileId = map.getTileId(tileX, tileY);//Exact tile player wants to move too
            if (TileManager.tiles[tileId].isSolid()) {//If tile is solid move the player. If not solid player cannot move
                worldX = nextX;
                worldY = nextY;
            }
        }
    }

    //Changes a certain movement variable to true if certain keys are pressed
    public void keyPressed(KeyEvent e) {
        System.out.println("Button Pressed");
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W){
            up = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S){
            down = true;
        } else if (e.getKeyCode() == KeyEvent.VK_A){
            right = true;
        } else if (e.getKeyCode() == KeyEvent.VK_D){
            left = true;
        }
    }

    //When key is let go stop the movement of player
    public void keyReleased(KeyEvent e) {
        System.out.println("button released");
        if (e.getKeyCode() == KeyEvent.VK_W){
            up = false;
        } else if (e.getKeyCode() == KeyEvent.VK_S){
            down = false;
        } else if (e.getKeyCode() == KeyEvent.VK_A){
            right = false;
        } else if (e.getKeyCode() == KeyEvent.VK_D){
            left = false;
        }
    }
}
