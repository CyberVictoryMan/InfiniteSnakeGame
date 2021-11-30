package snake.paint;

import snake.main.Data;

import java.awt.*;

public class Food {
    public static void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(50 + Data.xOffset, 50 + Data.yOffset,50, 50);
        g.fillRect(500 + Data.xOffset, 100 + Data.yOffset,50, 50);
    }
}
