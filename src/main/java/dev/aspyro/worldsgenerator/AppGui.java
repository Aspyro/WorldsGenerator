package dev.aspyro.worldsgenerator;

import javax.swing.*;
import java.awt.*;

public class AppGui {

    public AppGui() {
        creationGUI();

    }

    public void creationGUI(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(154, 165, 127));
        menuBar.setPreferredSize(new Dimension(200, 20));

        JLabel yellowLabel = new JLabel();
        yellowLabel.setBackground(new Color(212, 209, 18));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        frame.setJMenuBar(menuBar);
        frame.setContentPane(yellowLabel);

        frame.pack();
        frame.setVisible(true);
    }
}
