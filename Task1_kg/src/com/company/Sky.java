package com.company;

import java.awt.*;

public class Sky implements Drawable {
    private int y;


    public Sky(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g) { drawSky(g, this.y); }

    public static void drawSky (Graphics2D g, int y) {
        g.setColor(Color.CYAN);
        g.fillRect(0, y, 800, 350-y);
    }
}
