package fr.diginamic;

import fr.diginamic.banque.entites.Adresse;
import fr.diginamic.banque.entites.Banque;
import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Operation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class appBanque {
    public static void main( String[] args ) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
// Création d'une instance de la classe Adresse
        Adresse adresseClient1 = new Adresse(11,"CHEMIN",34070,"MONTPELLEIR");
//Création d'une instance de la classe Client
        Client client1 = new Client("ASSANI","SADADI", LocalDate.of(1997,9,24),adresseClient1);
// Création d'une instance de la classe Operation
        Operation operation = new Operation(LocalDate.now(),250,"virement loyer");
// Persiste l'objet Operation dans la base de données
        em.persist(operation);
        em.persist(client1);

        em.getTransaction().commit();
        em.close();
        emf.close();


    }
}
