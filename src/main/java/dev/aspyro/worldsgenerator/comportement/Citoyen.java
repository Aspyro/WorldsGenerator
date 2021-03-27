package dev.aspyro.worldsgenerator.comportement;

import dev.aspyro.worldsgenerator.comportement.generateurs.*;

import java.util.Hashtable;
import java.util.Random;

/**
 * Contient tout ce qui concerne un Citoyen
 *
 * @author Aspyro
 * @version %I%, %G%
 */
public class Citoyen {

    private String prenomsCitoyen;
    private String nomsCitoyen;
    private Foyer foyer;

    /**
     * Constructeur de la classe Citoyen
     */
    public Citoyen() {

        this.prenomsCitoyen = genererListePrenoms();
        this.nomsCitoyen = genererListeNoms();

    }

    /**
     * Constructeur de la classe Citoyen
     *
     * @param prenoms la liste des prénoms à attribuer au Citoyen
     * @param noms la liste des noms à attribuer au Citoyen
     */
    public Citoyen(String prenoms, String noms){
        this.prenomsCitoyen = prenoms;
        this.nomsCitoyen = noms;
    }

    /**
     * Génération d'une liste de prénoms
     *
     * @return la liste des prénoms générée
     */
    public String genererListePrenoms(){

        Random r = new Random();
        int n = r.nextInt(5) + 1;

        return genererListePrenoms(n);
    }

    /**
     * Génération d'une liste de prénoms
     *
     * @param quantite le nombre de prénoms à générer
     * @return la liste des prénoms générée
     */
    public String genererListePrenoms(int quantite){

        GenerateurPrenom gen = new GenerateurPrenom();
        StringBuilder prenoms = new StringBuilder();

        for (int i = 0; i < quantite; i++) {

            switch (i) {
                case 0:
                    Random r = new Random();
                    int n = r.nextInt(2);

                    if (n == 0) prenoms = prenoms.append(gen.genererPrenomCompose()).append(" ");
                    else prenoms = prenoms.append(gen.genererPrenom()).append(" ");

                    break;
                default:
                    if (i == quantite - 1) prenoms = prenoms.append(gen.genererPrenom());
                    else prenoms = prenoms.append(gen.genererPrenom()).append(" ");
                    break;
            }
        }
        return prenoms.toString();
    }

    /**
     *
     * Génération d'une liste de noms
     *
     * @return la liste de noms générée
     */
    public String genererListeNoms(){

        Random r = new Random();
        int n = r.nextInt(5) + 1;

        return genererListeNoms(n);
    }

    /**
     * Génération d'une liste de noms
     *
     * @param quantite le nombre de noms à générer
     * @return la liste de noms générée
     */
    public String genererListeNoms(int quantite){

        StringBuilder noms = new StringBuilder();
        GenerateurNom gen = new GenerateurNom();

        for (int i = 0; i < quantite; i++) {
            if(i == quantite - 1) noms = noms.append(gen.genererNom());
            else noms = noms.append(gen.genererNom()).append(" ");
        }

        return noms.toString();
    }

    /**
     * Obtenir les prenoms du Citoyen
     * @return prenomsCitoyen les prenoms du Citoyen
     */
    public String getPrenomsCitoyen() {

        return prenomsCitoyen;
    }

    /**
     * Modifie les prenoms du Citoyen
     *
     * @param prenomsCitoyen les prenoms que possède le Citoyen avant le changement
     */
    public void setPrenomsCitoyen(String prenomsCitoyen) {
        this.prenomsCitoyen = prenomsCitoyen;
    }

    /**
     * Obtenir les noms du Citoyen
     *
     * @return nomsCitoyen les noms du Citoyen
     */
    public String getNomsCitoyen() {
        return nomsCitoyen;
    }

    /**
     * Modifie les noms du Citoyen
     *
     * @param nomsCitoyen les noms du Citoyen
     */
    public void setNomsCitoyen(String nomsCitoyen) {
        this.nomsCitoyen = nomsCitoyen;
    }

    /**
     * Obtenir le Foyer du Citoyen
     *
     * @return foyer le Foyer du Citoyen
     */
    public Foyer getFoyer() {
        return this.foyer;
    }

    /**
     * Modifie le foyer du Citoyen
     *
     * @param foyer le Foyer du Citoyen
     */
    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    /**
     * Obtenir toutes les informations concernant le Citoyen
     * @return infosCitoyen un tableau comprenant toutes les information du Citoyen
     */
    public String getIdentiteCitoyen() {

        Hashtable<String, String> tableInfos = new Hashtable<>();

        StringBuilder temp = new StringBuilder();

        // Obtenir prénoms du Citoyen
        tableInfos.put("prenoms", getPrenomsCitoyen());

        // Obtenir noms du Citoyen
        tableInfos.put("noms", getNomsCitoyen());

        // Obtenir nom du Foyer du Citoyen
        tableInfos.put("foyer", getFoyer().getNomFoyer());

        temp.append("Prenoms : ").append(tableInfos.get("prenoms")).append("; ");
        temp.append("Noms : ").append(tableInfos.get("noms")).append("; ");
        temp.append("Foyer : ").append(tableInfos.get("foyer")).append("; ");

        return temp.toString();
    }
}
