package school.prog2.hei;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private final String nom;
    private final String prenom;
    private final LocalDate dateNaissance;
    private final String adresse;
    private final String email;
    private final String telephone;

    public Client(String nom,
                  String prenom,
                  LocalDate dateNaissance,
                  String adresse,
                  String email,
                  String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}