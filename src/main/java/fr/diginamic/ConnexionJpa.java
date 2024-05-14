package fr.diginamic;

import fr.diginamic.enties.Client;
import fr.diginamic.enties.Emprunt;
import fr.diginamic.enties.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa  {
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Récupération d'un livre en fonction de son ID
       Livre livre = em.find(Livre.class,1);

        if (livre != null) {
            System.out.println("Livre trouvé : " + livre.getTitre() );
        } else {
            System.out.println("Livre non trouvé.");
        }
        Livre livre2 = new Livre("vivre ensemble","sadid");
        em.persist(livre2);


        //

        Emprunt emprunt = em.find(Emprunt.class,2);

        if (null != emprunt) {
            System.out.println("trouvé"+emprunt.getLivres().iterator());
        }
  // Récuperation d'un client avec tous ses emprunts


        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
