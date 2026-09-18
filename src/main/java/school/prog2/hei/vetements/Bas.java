package school.prog2.hei.vetements;

public class Bas extends Vetement {
    private final int tourTaille;

    public Bas(String nom, Taille taille, double prixUnitaire, Materiau materiau, int tourTaille) {
        super(nom, taille, prixUnitaire, materiau);
        this.tourTaille = tourTaille;
    }

    public int getTourTaille() {
        return tourTaille;
    }
}