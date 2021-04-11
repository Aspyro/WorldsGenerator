package dev.aspyro.worldsgenerator.comportement;

import java.util.ArrayList;
import java.util.Arrays;

public class Family {

    private String familyName;
    private ArrayList<Citizen> familyMembers = new ArrayList<>();

    public Family() {
        this.familyName = "";
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String nouveauNom) {
        this.familyName = nouveauNom;
    }

    public void addFamilyMember(Citizen citizen) {


        // Si liste vide, nom du citoyen => nom foyer
        if(this.familyMembers.isEmpty())
        {
            this.familyMembers.add(citizen);
            setFamilyName(citizen.getCitizenLastname());
        }
        else this.familyMembers.add(citizen);

        citizen.setFamily(this);

    }

    public String getFamilyMembers() {
        // pour chaque membre => getIdentite
        String[] familyMembersList = new String[this.familyMembers.size()];
        int i = 0;

        for (Citizen citizen : this.familyMembers) {
            familyMembersList[i] = citizen.getCitizenIdentity();
            i++;
        }

        return Arrays.toString(familyMembersList);
    }

}
