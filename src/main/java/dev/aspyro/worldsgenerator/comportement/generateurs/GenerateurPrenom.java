package dev.aspyro.worldsgenerator.comportement.generateurs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

/**
 * Classe servant à générer des prénoms pour les Citoyens
 */
public class GenerateurPrenom {

    String fileName = "prenoms/listePrenoms.txt";
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource(fileName).getFile());
    String[] fileContent;

    public GenerateurPrenom() {

        try {
            this.fileContent = Files.readAllLines(file.toPath()).toArray(new String[0]);
        }
        catch(IOException e)
        {
            System.out.println("Une erreur a été levée avec le fichier");
        }
    }

    private Random random = new Random();
    private String separateur = "-";

    public String genererPrenom(){
        if (fileContent == null || fileContent.length <= 0) return "";
        return fileContent[this.random.nextInt(fileContent.length)];
    }

    public String genererPrenomCompose(){

        StringBuilder temp = new StringBuilder();
        if(fileContent == null || fileContent.length <= 0) return "";

        String premier = fileContent[this.random.nextInt(fileContent.length)];
        String deuxieme = fileContent[this.random.nextInt(fileContent.length)];

        while (premier.equals(deuxieme)) deuxieme = fileContent[this.random.nextInt(fileContent.length)];

        premier = premier.substring(0, 1).toUpperCase() + premier.substring(1).toLowerCase();
        deuxieme = deuxieme.substring(0, 1).toUpperCase() + deuxieme.substring(1).toLowerCase();

        temp.append(premier);
        temp.append(separateur);
        temp.append(deuxieme);

        return temp.toString();
    }
}
