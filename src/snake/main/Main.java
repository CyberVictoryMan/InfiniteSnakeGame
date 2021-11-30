package snake.main;

import snake.input.KeyListenerr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Main {
    public static JFrame frame;
    public static Canvas canvas;
    public static KeyListener l = new KeyListenerr();
    public static Canvas getCanvas() {
        return canvas;
    }

    public static void main(String[] args) {
	    frame = new JFrame();
        canvas = new Canvas();
        frame.setTitle("Infinite Snake Game");
        frame.setSize(1280, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.addKeyListener(l);
        while (true){
            Loop.tick();
        }
    }
}
