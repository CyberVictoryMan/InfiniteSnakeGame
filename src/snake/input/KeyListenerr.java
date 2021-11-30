package snake.input;

import snake.main.Data;
import snake.main.Loop;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerr implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            Data.yOffset += 50;
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            Data.yOffset -= 50;
        }
        if(e.getKeyCode() == KeyEvent.VK_A){
            Data.xOffset += 50;
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            Data.xOffset -= 50;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
