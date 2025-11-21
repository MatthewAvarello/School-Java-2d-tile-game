package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener {
    //declare the tile map and the player
    private Player player;
    private TileMap tileMap;
    private int cameraX, cameraY;//How player is seen on screen

    public GamePanel(){
        //make tile map and give it a height and width of 50
        tileMap = new TileMap(50, 50);

        //make player
        player = new Player(100, 100);
        
        //Listen for when a key is pressed(possible due to implementing keylistener interface and implementing those functions)
        addKeyListener(this);

        //make it so when key is pressed it goes to the panel
        setFocusable(true);

        //Set the tile maps tiles(making my own tilemap through some sort of editor is next step)
        for (int y = 0; y < 50; y++) {
            for (int x = 0; x < 50; x++) {
                if (y < 10) tileMap.setTileId(x, y, TileManager.TILE_NUM_GRASS);
                else if (y < 20) tileMap.setTileId(x, y, TileManager.TILE_NUM_DIRT);
                else tileMap.setTileId(x, y, TileManager.TILE_NUM_WATER);
            }
        }

        //Start game
        startGameLoop();
    }

    private void startGameLoop() {
        Timer timer = new Timer(16, e -> {
            updateGame();//update player location, camera etc.
            repaint();//rerender game
        });
        timer.start();//start the timer
    }

    private void updateGame() {
        //Runs player update function that moves player
        player.update(tileMap);

        //based off new player position recalculate where the camera shows the player
        cameraX = player.worldX - Constants.SCREEN_WIDTH / 2;
        cameraY = player.worldY - Constants.SCREEN_HEIGHT / 2;
    }

    @Override
    //Implements keylistener. Links the event to the player button pressed fucntions
    public void keyPressed(KeyEvent event){
        player.keyPressed(event);
    }

    //Implements keylistener. Links the event to the player button pressed fucntions
    @Override
    public void keyReleased(KeyEvent event) {
        player.keyReleased(event);
    }

    //Implements keylistener. Links the event to the player button pressed fucntions
    //This is empty because i have no use for it but needs to be implemented due to the interface
    @Override
    public void keyTyped(KeyEvent e) {
            
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black)
        for (int y = 0; y < tileMap.getHeight(); y++) {
            for (int x = 0; x < tileMap.getWidth(); x++) {
                int tileId = tileMap.getTileId(x, y);
                Tile tile = TileManager.tiles[tileId];

                int screenX = x * Constants.SCALED_TILE_SIZE - cameraX;
                int screenY = y * Constants.SCALED_TILE_SIZE - cameraY;

                g.drawImage(tile.getImage(), screenX, screenY, Constants.SCALED_TILE_SIZE, Constants.SCALED_TILE_SIZE, null);
            }
        }

        g.setColor(Color.RED);//temp player
        g.fillRect(player.worldX - cameraX, player.worldY - cameraY, Constants.SCALED_TILE_SIZE, Constants.SCALED_TILE_SIZE);
    }
}
