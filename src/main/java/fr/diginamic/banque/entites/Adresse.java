package fr.diginamic.banque.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {
    @Column(name = "NUMERO")
    private  int numero;
    @Column(name = "RUE")
    private String rue;
    @Column(name = "CODE_POSTAL")
    private  int codePostal;
    @Column(name = "VILLE")
    private  String ville;

    public Adresse() {
    }

    public Adresse(int numero,String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;



    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                ", numero=" + numero +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
