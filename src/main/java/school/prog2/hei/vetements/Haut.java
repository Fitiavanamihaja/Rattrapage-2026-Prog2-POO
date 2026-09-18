package school.prog2.hei.vetements;

public class Haut extends Vetement {
    private final TypeManches typeManches;

    public Haut(String nom, Taille taille, double prixUnitaire, Materiau materiau, TypeManches typeManches) {
        super(nom, taille, prixUnitaire, materiau);
        this.typeManches = typeManches;
    }

    public TypeManches getTypeManches() {
        return typeManches;
    }
}