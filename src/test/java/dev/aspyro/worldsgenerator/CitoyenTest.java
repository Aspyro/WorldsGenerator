package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.comportement.Citoyen;
import dev.aspyro.worldsgenerator.comportement.generateurs.GenerateurPrenom;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class CitoyenTest {

    @Test
    public void generationCitoyen()
    {
        // Créer un nouveau citoyen avec génération autonome
        // des noms et prénoms
        Citoyen cit1 = new Citoyen();
        Citoyen cit2 = new Citoyen();
        Citoyen cit3 = new Citoyen();

        // Afficher les informations complète d'un citoyen

        // Afficher les prénoms d'un citoyen
/*
        System.out.println(cit1.getPrenomsCitoyen());
        // Afficher les noms d'un citoyen
        System.out.println(cit1.getNomsCitoyen());
        // Ajouter Citoyen dans Famille
*/

        System.out.println(cit1.getIdentiteCitoyen());
        System.out.println(cit2.getIdentiteCitoyen());
        System.out.println(cit3.getIdentiteCitoyen());
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

