package school.prog2.hei;

import org.junit.jupiter.api.Test;
import school.prog2.hei.vetements.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandeTest {

    @Test
    void getMontantTotal_doitAdditionnerToutesLesLignes() {
        Client client = new Client(
                "Dupont",
                "Jean",
                LocalDate.of(1990, 1, 1),
                "1 rue Principale",
                "jean.dupont@example.com",
                "0123456789"
        );

        Commande commande = new Commande(
                LocalDate.of(2026, 1, 15),
                "Commande de test",
                client
        );

        Haut tshirt = new Haut(
                "T-Shirt",
                Taille.M,
                20.0,
                Materiau.COTON,
                TypeManches.COURT
        );

        Bas jean = new Bas(
                "Jean",
                Taille.L,
                50.0,
                Materiau.AUTRE,
                32
        );

        commande.ajouterVetement(tshirt, 2);
        commande.ajouterVetement(jean, 1);

        assertEquals(90.0, commande.coutTotal(), 0.001);
    }


    @Test
    void coutTotal_commandeVide_doitRetournerZero() {
        Client client = new Client(
                "Martin",
                "Sophie",
                LocalDate.of(1995, 2, 2),
                "2 rue Principale",
                "sophie.martin@example.com",
                "987654321"
        );

        Commande commande = new Commande(
                LocalDate.of(2026, 1, 16),
                "Commande vide",
                client
        );

        assertEquals(0.0, commande.coutTotal(), 0.001);
    }
}