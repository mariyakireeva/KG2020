package com.company;

import java.awt.*;

public class Ground implements Drawable{
    private int y;


    public Ground(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g) { drawGround(g, this.y); }

    public static void drawGround (Graphics2D g, int y) {
        g.setColor(Color.GREEN);
        g.fillRect(0, y, 800, 600-y);
    }
}
