package com.company;

import java.awt.*;

public class House implements Drawable{
    private int x, y, r;

    public static final Color Brown = new Color(139, 69, 19);

    public House(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(Graphics2D g) {
        drawHouse(g, this.x, this.y, this.r);
    }

    public static void drawHouse (Graphics2D g, int x, int y, int r) {
        g.setColor(Color.PINK);
        g.fillRect(x, y, 220, 180); //фасад

        g.setColor(Color.CYAN);
        g.fillRect(x + 27, y + 30, 70, 70); //левое окно
        g.fillRect(x + 124, y + 30, 70, 70); //правое окно

        g.setColor(Color.RED);
        Polygon p1 = new Polygon(); //крыша
        p1.addPoint(x - 70, y);
        p1.addPoint(x + 290, y);
        p1.addPoint(x + 110, y - 140);
        g.drawPolygon(p1);
        g.fillPolygon(p1);

        g.setColor(Color.MAGENTA);
        Polygon p2 = new Polygon(); //левая шторка
        p2.addPoint(x + 27, y + 90);
        p2.addPoint(x + 27, y + 30);
        p2.addPoint(x + 97, y + 30);
        p2.addPoint(x + 97, y + 90);
        p2.addPoint(x + 62, y + 30);
        g.drawPolygon(p2);
        g.fillPolygon(p2);

        Polygon p3 = new Polygon(); //правая шторка
        p3.addPoint(x + 124, y + 90);
        p3.addPoint(x + 124, y + 30);
        p3.addPoint(x + 194, y + 30);
        p3.addPoint(x + 194, y + 90);
        p3.addPoint(x + 159, y + 30);
        g.drawPolygon(p3);
        g.fillPolygon(p3);

        g.setColor(Brown); //дверь
        g.fillRect(x + 93, y + 125, 33, 55);

        g.setColor(Color.PINK); //дымоход
        Polygon p4 = new Polygon();
        p4.addPoint(x + 184, y - 83);
        p4.addPoint(x + 184, y - 115);
        p4.addPoint(x + 216, y - 115);
        p4.addPoint(x + 216, y - 58);
        g.drawPolygon(p4);
        g.fillPolygon(p4);

        g.setColor(Color.BLACK);
        g.drawLine(x + 184, y - 115, x + 216, y - 58);

        g.setColor(Color.CYAN); //окно на крыше
        g.fillOval(x + 110 -r, y - 60 -r, r+r, r+r);
    }
}
