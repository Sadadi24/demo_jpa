package fr.diginamic.banque.entites;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRETA")
public class LivretA  extends Compte {
    @Column(name = "TAUX")
    private double taux;


    public LivretA() {
    }

    public LivretA(String numCompte, double solde, double taux) {
        super(numCompte, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "LivretA{" +
                "taux=" + taux +
                '}';
    }
}
