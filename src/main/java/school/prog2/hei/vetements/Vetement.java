package school.prog2.hei.vetements;

public abstract class Vetement {
    private final String nom;
    private final Taille taille;
    private final double prixUnitaire;
    private final Materiau materiau;

    protected Vetement(String nom, Taille taille, double prixUnitaire, Materiau materiau) {
        this.nom = nom;
        this.taille = taille;
        this.prixUnitaire = prixUnitaire;
        this.materiau = materiau;
    }

    public String getNom() {
        return nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public Materiau getMateriau() {
        return materiau;
    }
}