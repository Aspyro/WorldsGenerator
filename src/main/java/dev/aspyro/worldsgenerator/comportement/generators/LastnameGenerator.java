package dev.aspyro.worldsgenerator.comportement.generators;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

/**
 * Classe servant à générer des noms pour les Citoyens
 * @author Aspyro
 * @version %I%, %G%
 */
public class LastnameGenerator {

    String fileName = "noms/listeNoms.txt";
    String[] fileContent;

    private Random random = new Random();

    /**
     * Constructeur de la classe GenerateurNom
     */
    public LastnameGenerator() {

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
    public String generateLastname(){

        if (fileContent == null || fileContent.length <= 0) return "";

        String lastname = fileContent[this.random.nextInt(fileContent.length)];

        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();

        return lastname;
    }

}
