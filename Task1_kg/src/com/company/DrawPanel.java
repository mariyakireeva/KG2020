package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Ground ground = new Ground(350);
    private Sky sky = new Sky(0);
    private Sun sun = new Sun(100, 120, 30, 70,  38, Color.YELLOW);
    private House house = new House(300, 250, 35);
    private Title title = new Title(330, 30);
    private Flowers flower1 = new Flowers(200, 360, 10, 7, Color.RED);
    private Flowers flower2 = new Flowers(100, 360, 10, 7, Color.ORANGE);
    private Flowers flower3 = new Flowers(620, 360, 10, 7, Color.MAGENTA);
    private Flowers flower4 = new Flowers(720, 360, 10, 7, Color.PINK);

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        ground.draw(gr);
        sky.draw(gr);
        sun.draw(gr);
        house.draw(gr);
        title.draw(gr);
        flower1.draw(gr);
        flower2.draw(gr);
        flower3.draw(gr);
        flower4.draw(gr);
    }
}
