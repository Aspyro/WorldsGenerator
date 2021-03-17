package dev.aspyro.worldsgenerator.comportement.generateurs;

import java.util.Random;

/**
 * Classe servant à générer des prénoms pour les Citoyens
 */
public class GenerateurPrenom {

    private String[] tableauPrenoms = {
            "Léo", "Louis", "Raphaël", "Jules", "Lucas", "Sacha", "Arthur", "Gabriel",
            "Gabin", "Maël", "Paul", "Marius", "Hugo", "Martin", "Robin", "Malo", "Noah",
            "Léandre", "Gaspard", "Adam", "Axel", "Marceau", "Mathis", "Naël", "Tom",
            "Liam", "Milo", "Simon", "Victor", "Antoine", "Eden", "Léon", "Marin", "Théo",
            "Timéo", "Enzo", "Clément", "Ethan", "Camille", "Mathéo", "Nathan", "Anatole",
            "Maxence", "Tiago", "Aaron", "Augustin", "Charly", "Eliott", "Naïm", "Noa"
    };
    private Random random = new Random();
    private String separateur = "-";

    public String genererPrenom(){
        if (tableauPrenoms == null || tableauPrenoms.length <= 0) return "";
        return tableauPrenoms[this.random.nextInt(tableauPrenoms.length)];
    }

    public String genererPrenomCompose(){
        if(tableauPrenoms == null || tableauPrenoms.length <= 0) return "";

        String premier = tableauPrenoms[this.random.nextInt(tableauPrenoms.length)];
        String deuxieme = tableauPrenoms[this.random.nextInt(tableauPrenoms.length)];

        while (premier.equals(deuxieme)) deuxieme = tableauPrenoms[this.random.nextInt(tableauPrenoms.length)];

        return premier + separateur + deuxieme;
    }
}
