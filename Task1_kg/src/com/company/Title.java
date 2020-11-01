package com.company;

import java.awt.*;

public class Title implements Drawable{
    private int x, y;

    public Title(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        drawTitle(g, this.x, this.y);
    }

    public static void drawTitle (Graphics2D g, int x, int y) {
        g.setColor(Color.BLUE);
        g.drawLine(x, y, x, y + 50);
        g.drawLine(x, y, x + 25, y + 50);
        g.drawLine(x + 25, y + 50, x + 50, y);
        g.drawLine(x + 50, y, x + 50, y + 50);

        g.drawLine(x + 70, y + 50, x + 85, y);
        g.drawLine(x + 85, y, x + 100, y + 50);
        g.drawLine(x + 77, y + 25, x + 92, y + 25);

        g.drawLine(x + 120, y, x + 120, y + 50);
        g.drawLine(x + 145, y, x + 145, y + 50);
        g.drawLine(x + 170, y, x + 170, y + 50);
        g.drawLine(x + 120, y + 50, x + 170, y + 50);

        g.drawLine(x + 190, y + 50, x + 205, y);
        g.drawLine(x + 205, y, x + 220, y + 50);
        g.drawLine(x + 197, y + 25, x + 212, y + 25);

        g.drawLine(x + 260, y, x + 290, y);
        g.drawLine(x + 290, y, x + 260, y + 50);

        g.drawLine(x + 310, y + 50, x + 325, y);
        g.drawLine(x + 325, y, x + 340, y + 50);

        g.drawLine(x + 360, y + 50, x + 360, y);
        g.drawLine(x + 360, y, x + 390, y);
        g.drawLine(x + 360, y + 25, x + 390, y + 25);
        g.drawLine(x + 360, y + 50, x + 390, y + 50);

        g.drawLine(x + 410, y, x + 440, y);
        g.drawLine(x + 425, y, x + 425, y +50);
        }
}
