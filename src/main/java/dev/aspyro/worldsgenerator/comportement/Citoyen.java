package dev.aspyro.worldsgenerator.comportement;

import dev.aspyro.worldsgenerator.comportement.generateurs.GenerateurPrenom;

import java.util.ArrayList;
import java.util.Random;

public class Citoyen {

    // TODO Remplacer les ArrayList par des Tableaux
    // ToDo Tester generation de prenoms aleatoires
    // TODO Tester generation de noms aleatoires
    // TODO Remplir les tableaux de prenoms et de noms

    private ArrayList<String> listePrenoms;
    private ArrayList<String> listeNoms;

    /**
     * Constructeur de la classe Citoyen
     */
    public Citoyen() {

        new Citoyen(genererListePrenoms(), genererListeNoms());

    }

    /**
     * Constructeur de la classe Citoyen
     *
     * @param prenoms la liste des prénoms à attribuer au Citoyen
     * @param noms la liste des noms à attribuer au Citoyen
     */
    public Citoyen(ArrayList<String> prenoms, ArrayList<String> noms){
        this.listePrenoms = prenoms;
        this.listeNoms = noms;
    }

    /**
     * Génération d'une liste de prénoms
     *
     * @return la liste des prénoms générée
     */
    public ArrayList<String> genererListePrenoms(){

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
    public ArrayList<String> genererListePrenoms(int quantite){

        ArrayList<String> listePrenoms = new ArrayList<>();
        String prenom;
        GenerateurPrenom gen = new GenerateurPrenom();

        for (int i = 0; i < quantite; i++) {
            if (i==0){

                Random r = new Random();
                int n = r.nextInt(2);

                if (n == 0){
                    prenom = gen.genererPrenomCompose();
                }
                else prenom = gen.genererPrenom();
            }
            else {
                prenom = gen.genererPrenom();
            }

            listePrenoms.add(prenom);

        }

        return listePrenoms;
    }

    /**
     *
     * Génération d'une liste de noms
     *
     * @return la liste de noms générée
     */
    public ArrayList<String> genererListeNoms(){

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
    public ArrayList<String> genererListeNoms(int quantite){

        ArrayList<String> listeNoms = new ArrayList<>();
        String nom;
        GenerateurPrenom gen = new GenerateurPrenom();

        for (int i = 0; i < quantite; i++) {
            if (i==0){

                Random r = new Random();
                int n = r.nextInt(2);

                if (n == 0){
                    nom = gen.genererPrenomCompose();
                }
                else nom = gen.genererPrenom();
            }
            else {
                nom = gen.genererPrenom();
            }

            listeNoms.add(nom);

        }

        return listeNoms;
    }

    public String getListePrenoms() {

        StringBuilder prenoms = new StringBuilder();

            for (String listePrenom : listePrenoms) {
                prenoms.append(listePrenom);
            }
        return prenoms.toString();
    }

    public void setListePrenoms(ArrayList<String> listePrenoms) {
        this.listePrenoms = listePrenoms;
    }

    public ArrayList<String> getListeNoms() {
        return listeNoms;
    }

    public void setListeNoms(ArrayList<String> listeNoms) {
        this.listeNoms = listeNoms;
    }
}
