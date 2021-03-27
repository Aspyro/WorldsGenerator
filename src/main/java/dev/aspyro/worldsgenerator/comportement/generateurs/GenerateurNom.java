package dev.aspyro.worldsgenerator.comportement.generateurs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Locale;
import java.util.Random;

/**
 * Classe servant à générer des noms pour les Citoyens
 * @author Aspyro
 * @version %I%, %G%
 */
public class GenerateurNom {

    String fileName = "noms/listeNoms.txt";
    String[] fileContent;

    private Random random = new Random();
    private String separateur = "-";

    /**
     * Constructeur de la classe GenerateurNom
     */
    public GenerateurNom() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try {
            this.fileContent = Files.readAllLines(file.toPath()).toArray(new String[0]);
        }
        catch(IOException e)
        {
            System.out.println("Une erreur a été levée avec le fichier");
        }
    }

    /**
     * Génère un nom (de famille)
     *
     * @return nom le nom de famille
     */
    public String genererNom(){

        if (fileContent == null || fileContent.length <= 0) return "";

        String nom = fileContent[this.random.nextInt(fileContent.length)];

        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1).toLowerCase();

        return nom;
    }

}
