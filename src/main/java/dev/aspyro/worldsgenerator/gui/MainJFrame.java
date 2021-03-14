package dev.aspyro.worldsgenerator.gui;

import javax.swing.*;
import java.awt.*;

public class MainJFrame extends JFrame
                        implements FrameComposite {

    public MainJFrame(){
        super();
    }

    public MainJFrame(String title){
        super(title);
    }

    public static void createAndShowMainJFrame(){
        JFrame appFrame = new MainJFrame("Application");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
