package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	MainWindow mw = new MainWindow();
	mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //метод для кнопки закрытия
	mw.setSize(800, 600);
	mw.setVisible(true);
    }
}
