package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    final static int WIDTH = 400;

    public static void main(String[] args) {


        JFrame frame = new JFrame("example");
        frame.setSize(WIDTH, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new com.company.MyPanel());

        frame.setVisible(true);


    }
}


class MyPanel extends JPanel {
    Timer timer;
    Car sm;
    int counter = 0;

    public MyPanel() {
        sm = new Car(20, 20);
        ActionListener actionListener = new ActionListener() {
            boolean direction = true;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (sm.getX() + 55 >= com.company.Main.WIDTH) {
                    direction = false;
                    counter++;
                } else if (sm.getX() <= 0) {
                    direction = !direction;
                    counter++;
                }
                if (!direction) {
                    sm.setX(sm.getX() - 2);
                } else {
                    sm.setX(sm.getX() + 2);
                }
            }
        };
        timer = new Timer(50, actionListener);
        timer.start();

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        sm.setGraphics((Graphics2D) g);
        sm.paint();
        g.setFont(new Font(Font.DIALOG, Font.BOLD, 35));
        g.drawString(String.valueOf(counter), 25, 30);
        repaint();
    }
}