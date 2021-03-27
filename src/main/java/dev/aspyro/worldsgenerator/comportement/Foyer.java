package dev.aspyro.worldsgenerator.comportement;

import java.util.ArrayList;
import java.util.Arrays;

public class Foyer {

    private String nomFoyer;
    private ArrayList<Citoyen> membresFoyer = new ArrayList<>();

    public Foyer() {
        this.nomFoyer = "";
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nouveauNom) {
        this.nomFoyer = nouveauNom;
    }

    public void ajouterCitoyen(Citoyen citoyen) {


        // Si liste vide, nom du citoyen => nom foyer
        if(this.membresFoyer.isEmpty())
        {
            this.membresFoyer.add(citoyen);
            setNomFoyer(citoyen.getNomsCitoyen());
        }
        else this.membresFoyer.add(citoyen);

        citoyen.setFoyer(this);

    }

    public String getMembresFoyer() {
        // pour chaque membre => getIdentite
        String[] listeMembres = new String[this.membresFoyer.size()];
        int i = 0;

        for (Citoyen citoyen : this.membresFoyer) {
            listeMembres[i] = citoyen.getIdentiteCitoyen();
            i++;
        }

        return Arrays.toString(listeMembres);
    }

}
