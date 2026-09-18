package school.prog2.hei;

import school.prog2.hei.vetements.Vetement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commande {
    private final LocalDate dateCommande;
    private final String description;
    private final Client client;
    private final List<LigneCommande> lignes = new ArrayList<>();

    public Commande(LocalDate dateCommande, String description, Client client) {
        this.dateCommande = dateCommande;
        this.description = description;
        this.client = client;
    }

    public void ajouterVetement(Vetement vetement, int quantite) {
        lignes.add(new LigneCommande(vetement, quantite));
    }

    public double coutTotal() {
        double total = 0.0;

        for (LigneCommande ligne : lignes) {
            total += ligne.getTotalLigne();
        }

        return total;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public Client getClient() {
        return client;
    }

    public List<LigneCommande> getLignes() {
        return Collections.unmodifiableList(lignes);
    }
}