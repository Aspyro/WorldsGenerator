package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.gui.*;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        //Todo Régler la position des panels pour que btnPanel soit à gauche et drawingPanel à droite
        //    sans qu'il y ait d'écart entre les deux
        //TODO Régler l'aligment des boutons pour qu'ils apparaissent horizontalement
        //TODO créer un menu pour l'application (menuBar)

        Dimension dimBtnPanel = new Dimension(200, 1000);

        // Creation fenetre
        JFrame mainFrame = new MainJFrame("Generateur de mondes");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creation et ajout du Panel Principal
        JPanel mainPanel = new MainJPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainPanel.setBackground(Color.red);
        mainFrame.getContentPane().add(mainPanel);

        // Creation et ajout du Panel Bouton
        JPanel btnPanel = new BtnJPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        btnPanel.setBackground(Color.GREEN);
        btnPanel.setMaximumSize(dimBtnPanel);
        mainPanel.add(btnPanel);

        // Creation et ajout du Panel Dessin
        JPanel drawingPanel = new DrawingJPanel();
        drawingPanel.setBackground(Color.blue);
        mainPanel.add(drawingPanel);

        // Creation et ajout des boutons
        btnPanel.add(new BtnJButton("bouton 1"));
        btnPanel.add(new BtnJButton("bouton 2"));
        btnPanel.add(new BtnJButton("bouton 3"));
        btnPanel.add(new BtnJButton("bouton 4"));
        btnPanel.add(new BtnJButton("bouton 5"));
        btnPanel.add(new BtnJButton("bouton 6"));
        btnPanel.add(new BtnJButton("bouton 7"));
        btnPanel.add(new BtnJButton("bouton 8"));
        btnPanel.add(new BtnJButton("bouton 9"));
        btnPanel.add(new BtnJButton("bouton 10"));
        btnPanel.add(new BtnJButton("bouton 11"));
        btnPanel.add(new BtnJButton("bouton 12"));

        // Affichage Frame
        mainFrame.pack();
        mainFrame.setBounds(400, 400, 1000, 300);
        mainFrame.setVisible(true);

    }


}
