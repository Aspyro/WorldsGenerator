package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.comportement.Citoyen;
import dev.aspyro.worldsgenerator.comportement.generateurs.GenerateurPrenom;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CitoyenTest {

    @Test
    public void generationCitoyen()
    {
        // Créer un nouveau citoyen avec génération autonome
        // des noms et prénoms
        Citoyen cit1 = new Citoyen();

        // Afficher les informations complète d'un citoyen

        // Afficher les prénoms d'un citoyen

        System.out.println(cit1.getListePrenoms());
        // Afficher les noms d'un citoyen
        System.out.println(cit1.getListeNoms());
        // Ajouter Citoyen dans Famille

    }

    @Test
    public void generationRandom()
    {
        Random r = new Random();
        for(int i = 0; i < 10; i++)
        {
            int n = r.nextInt(5) + 1;
            System.out.println(n);
        }

    }

    @Test
    public void generationPrenoms(){
        GenerateurPrenom gen = new GenerateurPrenom();
        for(int i = 0; i < 10; i++)
        {
            System.out.println(gen.genererPrenom());
        }
    }
}

