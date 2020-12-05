package com.company;

import java.awt.*;

public class Car {
    private int x, y;
    Graphics2D g;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setGraphics(Graphics2D g) {
        this.g = g;
    }


    public void paint() {
        g.setColor(Color.BLUE);
        g.fillOval(x + 50, y + 45, 24, 24);
        g.fillOval(x + 85, y + 45, 24, 24);
        g.setColor(Color.darkGray);
        g.fillRect(x + 65, y + 20, 50, 25);


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}