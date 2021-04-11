package dev.aspyro.worldsgenerator.comportement.generators;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

/**
 * Classe servant à générer des prénoms pour les Citoyens
 *
 * @author Aspyro
 * @version %I%, %G%
 */
public class FirstnameGenerator {

    static final String fileName = "prenoms/listePrenoms.txt";
    String[] fileContent;
    private Random random = new Random();
    private String hyphen = "-";

    /**
     * Constructeur de la classe Generateur Prenom
     */
    public FirstnameGenerator() {

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
     * Génère un prénom
     *
     * @return le prénom généré
     */
    public String generateFirstname(){
        if (fileContent == null || fileContent.length <= 0) return "";
        return fileContent[this.random.nextInt(fileContent.length)];
    }

    /**
     * Génère un prénom composé
     *
     * @return le prénom composé généré
     */
    public String generateComposedFirstname(){

        StringBuilder builder = new StringBuilder();
        if(fileContent == null || fileContent.length <= 0) return "";

        String first = fileContent[this.random.nextInt(fileContent.length)];
        String second = fileContent[this.random.nextInt(fileContent.length)];

        while (first.equals(second)) second = fileContent[this.random.nextInt(fileContent.length)];

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        second = second.substring(0, 1).toUpperCase() + second.substring(1).toLowerCase();

        builder.append(first);
        builder.append(hyphen);
        builder.append(second);

        return builder.toString();
    }
}
