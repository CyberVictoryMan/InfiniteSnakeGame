package snake.main;

public class Data {
    public static int xOffset = 0;
    public static int yOffset = 0;
    public static int X = xOffset / 50;
    public static int Y = yOffset / 50;

    public static int getX() {
        return X;
    }

    public static void setX(int x) {
        X = x;
    }

    public static int getY() {
        return Y;
    }

    public static void setY(int y) {
        Y = y;
    }


}
