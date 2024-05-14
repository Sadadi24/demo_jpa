package fr.diginamic.banque.entites;

import java.time.LocalDate;

public class AssuranceVie  extends Compte{
    private LocalDate dateFin;
    private double taux;

    public AssuranceVie() {
    }

    public AssuranceVie(String numCompte, double solde, LocalDate dateFin, double taux) {
        super(numCompte, solde);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "AssuranceVie{" +
                "dateFin=" + dateFin +
                ", taux=" + taux +
                '}';
    }
}
