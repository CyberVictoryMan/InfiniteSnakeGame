package snake.paint;

import java.awt.*;

public class Grid {
    public static void draw(Graphics g){
        g.setColor(Color.gray);
        for(int x = 0;x < 72;x++){
            g.drawLine(x * 50, 0, x *50, 720);
        }
        for(int y = 0;y < 128;y++){
            g.drawLine(0, y * 50, 1280, y * 50);
        }
    }
}
