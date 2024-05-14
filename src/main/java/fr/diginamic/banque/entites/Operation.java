package fr.diginamic.banque.entites;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE")
    private LocalDate date;
    @Column(name = "MOTANT")
    private double montant;
    @Column(name = "MOTIF")
    private String motif;
    @ManyToOne
    @JoinColumn(name = "OP_ID")
    private  Compte compte;
    public Operation(LocalDate date, double montant, String motif) {
        this.date = date;
        this.montant = montant;
        this.motif = motif;

    }

    public Operation() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", montant=" + montant +
                ", motif='" + motif + '\'' +
                '}';
    }
}
