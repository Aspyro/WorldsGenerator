package dev.aspyro.worldsgenerator.comportement;

import dev.aspyro.worldsgenerator.comportement.generators.*;

import java.util.Hashtable;
import java.util.Random;

/**
 * Contient tout ce qui concerne un Citoyen
 *
 * @author Aspyro
 * @version %I%, %G%
 */
public class Citizen {

    private String citizenFirstname;
    private String citizenLastname;
    private Family family;

    /**
     * Constructeur de la classe Citoyen
     */
    public Citizen() {

        this.citizenFirstname = generateFirstnameList();
        this.citizenLastname = generateLastnameList();

    }

    /**
     * Constructeur de la classe Citoyen
     *
     * @param firstname la liste des prénoms à attribuer au Citoyen
     * @param lastname la liste des lastname à attribuer au Citoyen
     */
    public Citizen(String firstname, String lastname){
        this.citizenFirstname = firstname;
        this.citizenLastname = lastname;
    }

    /**
     * Génération d'une liste de prénoms
     *
     * @return la liste des prénoms générée
     */
    public String generateFirstnameList(){

        Random r = new Random();
        int n = r.nextInt(5) + 1;

        return generateFirstnameList(n);
    }

    /**
     * Génération d'une liste de prénoms
     *
     * @param quantity le nombre de prénoms à générer
     * @return la liste des prénoms générée
     */
    public String generateFirstnameList(int quantity){

        FirstnameGenerator generator = new FirstnameGenerator();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < quantity; i++) {

            switch (i) {
                case 0:
                    Random r = new Random();
                    int n = r.nextInt(2);

                    if (n == 0) builder = builder.append(generator.generateComposedFirstname()).append(" ");
                    else builder = builder.append(generator.generateFirstname()).append(" ");

                    break;
                default:
                    if (i == quantity - 1) builder = builder.append(generator.generateFirstname());
                    else builder = builder.append(generator.generateFirstname()).append(" ");
                    break;
            }
        }
        return builder.toString();
    }

    /**
     *
     * Génération d'une liste de noms
     *
     * @return la liste de noms générée
     */
    public String generateLastnameList(){

        Random r = new Random();
        int n = r.nextInt(5) + 1;

        return generateLastnameList(n);
    }

    /**
     * Génération d'une liste de noms
     *
     * @param quantity le nombre de noms à générer
     * @return la liste de noms générée
     */
    public String generateLastnameList(int quantity){

        StringBuilder builder = new StringBuilder();
        LastnameGenerator generator = new LastnameGenerator();

        for (int i = 0; i < quantity; i++) {
            if(i == quantity - 1) builder = builder.append(generator.generateLastname());
            else builder = builder.append(generator.generateLastname()).append(" ");
        }

        return builder.toString();
    }

    /**
     * Obtenir les prenoms du Citoyen
     * @return prenomsCitoyen les prenoms du Citoyen
     */
    public String getCitizenFirstname() {

        return citizenFirstname;
    }

    /**
     * Modifie les prenoms du Citoyen
     *
     * @param citizenFirstname les prenoms que possède le Citoyen avant le changement
     */
    public void setCitizenFirstname(String citizenFirstname) {
        this.citizenFirstname = citizenFirstname;
    }

    /**
     * Obtenir les noms du Citoyen
     *
     * @return nomsCitoyen les noms du Citoyen
     */
    public String getCitizenLastname() {
        return citizenLastname;
    }

    /**
     * Modifie les noms du Citoyen
     *
     * @param citizenLastname les noms du Citoyen
     */
    public void setCitizenLastname(String citizenLastname) {
        this.citizenLastname = citizenLastname;
    }

    /**
     * Obtenir le Foyer du Citoyen
     *
     * @return foyer le Foyer du Citoyen
     */
    public Family getFamily() {
        return this.family;
    }

    /**
     * Modifie le foyer du Citoyen
     *
     * @param family le Foyer du Citoyen
     */
    public void setFamily(Family family) {
        this.family = family;
    }

    /**
     * Obtenir toutes les informations concernant le Citoyen
     * @return infosCitoyen un tableau comprenant toutes les information du Citoyen
     */
    public String getCitizenIdentity() {

        Hashtable<String, String> infoTable = new Hashtable<>();

        StringBuilder builder = new StringBuilder();

        // Obtenir prénoms du Citoyen
        infoTable.put("prenoms", getCitizenFirstname());

        // Obtenir noms du Citoyen
        infoTable.put("noms", getCitizenLastname());

        // Obtenir nom du Foyer du Citoyen
        infoTable.put("foyer", getFamily().getFamilyName());

        builder.append("Prenoms : ").append(infoTable.get("prenoms")).append("; ");
        builder.append("Noms : ").append(infoTable.get("noms")).append("; ");
        builder.append("Foyer : ").append(infoTable.get("foyer")).append("; ");

        return builder.toString();
    }
}
