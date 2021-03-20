package dev.aspyro.worldsgenerator.comportement;

import dev.aspyro.worldsgenerator.comportement.generateurs.GenerateurNom;
import dev.aspyro.worldsgenerator.comportement.generateurs.GenerateurPrenom;

import java.util.Random;

public class Citoyen {

    private String prenomsCitoyen;
    private String nomsCitoyen;

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
            if (i==0){

                Random r = new Random();
                int n = r.nextInt(2);

                if (n == 0){
                    prenoms = prenoms.append(gen.genererPrenomCompose());


                }
                else prenoms = prenoms.append(gen.genererPrenom());
            }
            else {
                prenoms = prenoms.append(gen.genererPrenom());
            }

            prenoms.append(" ");

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
            noms = noms.append(gen.genererNom());
        }

        return noms.toString();
    }

    public String getPrenomsCitoyen() {

        return prenomsCitoyen;
    }

    public void setPrenomsCitoyen(String prenomsCitoyen) {
        this.prenomsCitoyen = prenomsCitoyen;
    }

    public String getNomsCitoyen() {
        return nomsCitoyen;
    }

    public void setNomsCitoyen(String nomsCitoyen) {
        this.nomsCitoyen = nomsCitoyen;
    }

    public String[] getIdentiteCitoyen() {
        String[] infosCitoyen = {"", ""};
        StringBuilder temp = new StringBuilder();

        temp.append("Prenoms : ");
        temp.append(prenomsCitoyen);
        infosCitoyen[0] = temp.toString();

        temp.delete(0, temp.length());

        temp.append("Noms : ");
        temp.append(nomsCitoyen);
        infosCitoyen[1] = temp.toString();



        return infosCitoyen;
    }
}
