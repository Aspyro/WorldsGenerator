package dev.aspyro.worldsgenerator;

import dev.aspyro.worldsgenerator.comportement.*;
import org.junit.jupiter.api.Test;

public class FamilyTest {

    @Test
    public void creationFoyerTest() {

        // Crée un foyer avec une personne
        // Le nom du foyer doit être le nom de la première personne ajoutée

        Family familyTest = new Family();

        Citizen citizenTestHead = new Citizen();

        familyTest.addFamilyMember(citizenTestHead);

        System.out.println("Citoyen : " + citizenTestHead.getCitizenIdentity());

        System.out.println("Foyer : " + familyTest.getFamilyName());

    }

    @Test
    public void ajoutCitoyenFoyer() {

        Family familyTest = new Family();
        Citizen citizenTestHead = new Citizen();
        Citizen citizenTest2 = new Citizen();
        Citizen citizenTest3 = new Citizen();

        System.out.println("Citoyen 1 : " + citizenTestHead.getCitizenIdentity());
        System.out.println("Citoyen 2 : " + citizenTest2.getCitizenIdentity());
        System.out.println("Citoyen 3 : " + citizenTest3.getCitizenIdentity());

        familyTest.addFamilyMember(citizenTestHead);
        familyTest.addFamilyMember(citizenTest2);
        familyTest.addFamilyMember(citizenTest3);

        System.out.println("Foyer : " + familyTest.getFamilyName());
        System.out.println("Membres : " + familyTest.getFamilyMembers());

    }

    @Test
    public void testGetIdentiteCitoyen() {
        Family familyTest = new Family();
        Citizen citizen = new Citizen();
        familyTest.addFamilyMember(citizen);

        Citizen citizen2 = new Citizen();
        familyTest.addFamilyMember(citizen2);

        System.out.println(citizen2.getCitizenIdentity());
    }

}
