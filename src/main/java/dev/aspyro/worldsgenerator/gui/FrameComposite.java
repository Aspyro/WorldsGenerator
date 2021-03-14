package dev.aspyro.worldsgenerator.gui;

import java.awt.*;
import java.util.ArrayList;

public interface FrameComposite extends FrameComposant {

    ArrayList<FrameComposant> enfants = new ArrayList<>();

    default void ajouterEnfant(FrameComposant enfant){}

    default void supprimerEnfant(FrameComposant enfant){}
}
