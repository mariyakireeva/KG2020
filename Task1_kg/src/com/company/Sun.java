package com.company;

import java.awt.*;

public class Sun implements Drawable {
    private int x, y, r, R, n;
    private Color c;

    public Sun(int x, int y, int r, int r1, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        drawSun(g, this.x, this.y, this.r, this.R,  this.n, this.c);
    }

    public static void drawSun (Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x-r, y-r, r+r, r+r);

        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = x + r * Math.cos(da * i);
            double dy1 = y + r * Math.sin(da * i);
            double dx2 = x + R * Math.cos(da * i);
            double dy2 = y + R * Math.sin(da * i);

            g.drawLine((int)dx1, (int)dy1, (int)dx2, (int)dy2);
        }
    }
}
