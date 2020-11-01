package com.company;

import java.awt.*;

public class Flowers implements Drawable {
    private int x, y, r, n;
    private Color c;

    public static final Color DarkGreen = new Color(0, 100, 0);

    public Flowers(int x, int y, int r, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        drawFlowers(g, this.x, this.y, this.r, this.n, this.c);
    }

    public static void drawFlowers(Graphics2D g, int x, int y, int r, int n, Color c) {
        g.setColor(DarkGreen);
        g.fillRect(x - 3, y , 6, 65);

        Polygon p1 = new Polygon();
        p1.addPoint(x + 3, y + 50);
        p1.addPoint(x + 15, y + 20);
        p1.addPoint(x + 3, y + 40);
        g.drawPolygon(p1);
        g.fillPolygon(p1);

        Polygon p2 = new Polygon();
        p2.addPoint(x - 3, y + 38);
        p2.addPoint(x - 15, y + 18);
        p2.addPoint(x - 3, y + 28);
        g.drawPolygon(p2);
        g.fillPolygon(p2);

        double da = 2 * Math.PI / n;
            for (int i = 0; i < n; i++) {
                double dx = x + r * Math.cos(i * da);
                double dy = y + r * Math.sin(i * da);

            g.setColor(c);
            g.fillOval((int) dx - r, (int) dy - r, r + r, r + r);

            g.setColor(Color.BLACK);
            g.drawOval((int) dx - r, (int) dy - r, r + r, r + r);
         }

        g.setColor(Color.WHITE);
        g.fillOval(x - r, y - r, r + r, r + r);
    }
}

