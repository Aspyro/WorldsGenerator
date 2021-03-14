package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.gui.BtnJPanel;
import dev.aspyro.worldsgenerator.gui.DrawingJPanel;
import dev.aspyro.worldsgenerator.gui.MainJFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        Dimension dim = new Dimension(500, 300);

        JFrame frameTest = new MainJFrame("Une fenetre");
        frameTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelTest2 = new DrawingJPanel();
        panelTest2.setBackground(Color.BLUE);
        panelTest2.setMaximumSize(dim);

        frameTest.add(panelTest2,BorderLayout.SOUTH);

        frameTest.getContentPane().add(panelTest2);
        frameTest.pack();
        frameTest.setBounds(400, 400, 500, 300);
        frameTest.setVisible(true);
    }


}
