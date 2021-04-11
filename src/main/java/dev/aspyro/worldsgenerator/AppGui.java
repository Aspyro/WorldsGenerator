package dev.aspyro.worldsgenerator;

import javax.swing.*;
import java.awt.*;

public class AppGui {

    public AppGui() {
        creationGUI();

    }

    public void creationGUI(){

        // Création Frame
        JFrame frame = new JFrame("World Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création Panel principal
        JPanel outerPanel = new JPanel(new BorderLayout());

        // Création Left Panel
        JPanel leftPanel = new JPanel();
        GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setAutoCreateGaps(true);
        leftPanelLayout.setAutoCreateContainerGaps(true);
        leftPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Création Right Panel
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Ajouts à Panel principal
        outerPanel.add(leftPanel, BorderLayout.WEST);
        outerPanel.add(rightPanel, BorderLayout.EAST);

        // Créer les boutons
        JButton universButton = new JButton("Creer un Univers");
        universButton.setVerticalTextPosition(AbstractButton.CENTER);
        universButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton galaxieButton = new JButton("Creer une Galaxie");
        galaxieButton.setVerticalTextPosition(AbstractButton.CENTER);
        galaxieButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton systemeStellaireButton = new JButton("Creer un Systeme Stellaire");
        systemeStellaireButton.setVerticalTextPosition(AbstractButton.CENTER);
        systemeStellaireButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton planeteButton = new JButton("Creer une Planete");
        planeteButton.setVerticalTextPosition(AbstractButton.CENTER);
        planeteButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton continentButton = new JButton("Creer un Continent");
        continentButton.setVerticalTextPosition(AbstractButton.CENTER);
        continentButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton paysButton = new JButton("Creer un Pays");
        paysButton.setVerticalTextPosition(AbstractButton.CENTER);
        paysButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton regionButton = new JButton("Creer une Region");
        regionButton.setVerticalTextPosition(AbstractButton.CENTER);
        regionButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton provinceButton = new JButton("Creer une Province");
        provinceButton.setVerticalTextPosition(AbstractButton.CENTER);
        provinceButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton villeButton = new JButton("Creer une Ville");
        villeButton.setVerticalTextPosition(AbstractButton.CENTER);
        villeButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton rueButton = new JButton("Creer une Rue");
        rueButton.setVerticalTextPosition(AbstractButton.CENTER);
        rueButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton maisonButton = new JButton("Creer une Maison");
        maisonButton.setVerticalTextPosition(AbstractButton.CENTER);
        maisonButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton residenceButton = new JButton("Creer une Residence");
        residenceButton.setVerticalTextPosition(AbstractButton.CENTER);
        residenceButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton appartementButton = new JButton("Creer un Appartement");
        appartementButton.setVerticalTextPosition(AbstractButton.CENTER);
        appartementButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton foyerButton = new JButton("Creer un Foyer");
        foyerButton.setVerticalTextPosition(AbstractButton.CENTER);
        foyerButton.setHorizontalTextPosition(AbstractButton.CENTER);

        JButton citoyenButton = new JButton("Creer un Citoyen");
        citoyenButton.setVerticalTextPosition(AbstractButton.CENTER);
        citoyenButton.setHorizontalTextPosition(AbstractButton.CENTER);

        // Définition placement boutons (dans Left Panel)
        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createSequentialGroup()
                .addComponent(universButton)
                .addComponent(galaxieButton)
                .addComponent(systemeStellaireButton)
                .addComponent(planeteButton)
                .addComponent(continentButton)
                .addComponent(paysButton)
                .addComponent(regionButton)
                .addComponent(provinceButton)
                .addComponent(villeButton)
                .addComponent(rueButton)
                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(maisonButton)
                        .addComponent(residenceButton)
                )
                .addComponent(appartementButton)
                .addComponent(citoyenButton)
        );
        leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(universButton)
                    .addComponent(galaxieButton)
                    .addComponent(systemeStellaireButton)
                    .addComponent(planeteButton)
                    .addComponent(continentButton)
                    .addComponent(paysButton)
                    .addComponent(regionButton)
                    .addComponent(provinceButton)
                    .addComponent(villeButton)
                    .addComponent(rueButton)
                    .addComponent(residenceButton)
                    .addComponent(appartementButton)
                    .addComponent(citoyenButton)
                )
                .addComponent(maisonButton)
        );

        //TODO Créer panel de dessin à droite

        // Affichage Frame
        frame.setContentPane(outerPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
