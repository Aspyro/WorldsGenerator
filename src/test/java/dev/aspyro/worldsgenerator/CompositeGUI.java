package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.gui.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

public class CompositeGUI {

    @Test
    public void CompositeTest(){

        JFrame frameTest = new MainJFrame("Une fenetre");
        JPanel panelTest1 = new BtnJPanel();
        JPanel panelTest2 = new DrawingJPanel();

        frameTest.add(panelTest1);
        frameTest.add(panelTest2);
    }
}
