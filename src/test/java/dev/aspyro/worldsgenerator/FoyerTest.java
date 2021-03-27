package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.comportement.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FoyerTest {

    @Test
    public void creationFoyerTest() {

        // Crée un foyer avec une personne
        // Le nom du foyer doit être le nom de la première personne ajoutée

        Foyer foyerTest = new Foyer();

        Citoyen citoyenTestHead = new Citoyen();

        foyerTest.ajouterCitoyen(citoyenTestHead);

        System.out.println("Citoyen : " + citoyenTestHead.getIdentiteCitoyen());

        System.out.println("Foyer : " + foyerTest.getNomFoyer());

    }

    @Test
    public void ajoutCitoyenFoyer() {

        Foyer foyerTest = new Foyer();
        Citoyen citoyenTestHead = new Citoyen();
        Citoyen citoyenTest2 = new Citoyen();
        Citoyen citoyenTest3 = new Citoyen();

        System.out.println("Citoyen 1 : " + citoyenTestHead.getIdentiteCitoyen());
        System.out.println("Citoyen 2 : " + citoyenTest2.getIdentiteCitoyen());
        System.out.println("Citoyen 3 : " + citoyenTest3.getIdentiteCitoyen());

        foyerTest.ajouterCitoyen(citoyenTestHead);
        foyerTest.ajouterCitoyen(citoyenTest2);
        foyerTest.ajouterCitoyen(citoyenTest3);

        System.out.println("Foyer : " + foyerTest.getNomFoyer());
        System.out.println("Membres : " + foyerTest.getMembresFoyer());

    }

    @Test
    public void testGetIdentiteCitoyen() {
        Foyer foyerTest = new Foyer();
        Citoyen citoyen = new Citoyen();
        foyerTest.ajouterCitoyen(citoyen);

        Citoyen citoyen2 = new Citoyen();
        foyerTest.ajouterCitoyen(citoyen2);

        System.out.println(citoyen2.getIdentiteCitoyen());
    }

}
