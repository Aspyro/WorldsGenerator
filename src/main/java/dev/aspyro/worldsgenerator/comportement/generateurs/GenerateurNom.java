package dev.aspyro.worldsgenerator.comportement.generateurs;

import java.util.Random;

/**
 * Classe servant à générer des noms pour les Citoyens
 */
public class GenerateurNom {

    private String[] tableauNoms = {

    };
    private Random random = new Random();
    private String separateur = "-";

    public String genererNom(){
        if (tableauNoms == null || tableauNoms.length <= 0) return "";
        return tableauNoms[this.random.nextInt(tableauNoms.length)];
    }

}
