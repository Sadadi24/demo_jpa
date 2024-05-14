package fr.diginamic.banque.entites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
private Integer id;
    @Column(name = "NOM")
private String nom;
    @Column(name = "PRENOM")
private String prenom;
    @Column(name = "DATENAISSANCE")
private LocalDate dateNaissance;
@Embedded
private Adresse adresse;
@ManyToOne
@JoinColumn(name = "ID_CLIENT")
private Banque banque;
@ManyToMany
@JoinTable(name = "MES_COMPTES",
        joinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "ID_COMPTE",referencedColumnName = "ID")
)
private Set<Compte> comptes;

    public Client() {
    }

    public Client(String nom, String prenom, LocalDate dateNaissance, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
