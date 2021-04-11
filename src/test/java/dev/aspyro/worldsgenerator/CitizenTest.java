package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.comportement.Citizen;
import dev.aspyro.worldsgenerator.comportement.generators.FirstnameGenerator;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CitizenTest {

    @Test
    public void generationCitoyen()
    {
        // Créer un nouveau citoyen avec génération autonome
        // des noms et prénoms
        Citizen cit1 = new Citizen();
        Citizen cit2 = new Citizen();
        Citizen cit3 = new Citizen();

        // Afficher les informations complète d'un citoyen

        // Afficher les prénoms d'un citoyen
/*
        System.out.println(cit1.getPrenomsCitoyen());
        // Afficher les noms d'un citoyen
        System.out.println(cit1.getNomsCitoyen());
        // Ajouter Citoyen dans Famille
*/

        System.out.println(cit1.getCitizenIdentity());
        System.out.println(cit2.getCitizenIdentity());
        System.out.println(cit3.getCitizenIdentity());
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
        FirstnameGenerator gen = new FirstnameGenerator();
        for(int i = 0; i < 10; i++)
        {
            System.out.println(gen.generateFirstname());
        }
    }
}

