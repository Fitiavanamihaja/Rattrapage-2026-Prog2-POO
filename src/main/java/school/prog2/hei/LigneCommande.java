package school.prog2.hei;

import school.prog2.hei.vetements.Vetement;

public class LigneCommande {
    private final Vetement vetement;
    private final int quantite;

    public LigneCommande(Vetement vetement, int quantite) {
        this.vetement = vetement;
        this.quantite = quantite;
    }

    public Vetement getVetement() {
        return vetement;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getTotalLigne() {
        return vetement.getPrixUnitaire() * quantite;
    }
}