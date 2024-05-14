package fr.diginamic.banque.entites;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_COMPTE")
    private String numCompte;
    @Column(name = "SOLDE")
    private double solde;

    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;

    public Compte() {
    }

    public Compte(String numCompte, double solde) {
        this.numCompte= numCompte;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numCompte='" + numCompte + '\'' +
                ", solde=" + solde +
                '}';
    }
}
