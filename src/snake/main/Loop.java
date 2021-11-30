package snake.main;

import snake.paint.Food;
import snake.paint.Grid;
import snake.paint.Snake;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Loop {
    public static BufferStrategy bs;
    public static Graphics g;
    public static void tick(){
        render();
        Game.updateCoords();
    }

    public static void render() {
        bs = Main.getCanvas().getBufferStrategy();
        if(bs == null){
            Main.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        g.clearRect(0, 0,1280,720);
        //start
        Grid.draw(g);
        Snake.draw(g);
        Food.draw(g);
        //stop
        g.dispose();
        bs.show();
    }
}
