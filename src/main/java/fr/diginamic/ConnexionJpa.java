package fr.diginamic;

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
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
