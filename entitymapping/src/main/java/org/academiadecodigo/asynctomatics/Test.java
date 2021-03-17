package org.academiadecodigo.asynctomatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import java.sql.Date;
import java.time.LocalDate;

public class Test {

    private EntityManagerFactory emf;

    public Test() {
        emf = Persistence.createEntityManagerFactory("user");
    }

    public static void main(String[] args) {

        Test test = new Test();

        User user1 = new User();
        //user1.setId(1);
        user1.setName("Vasco");
        user1.setEmail("vasco@vasco.com");
        user1.setPhone(912345678);
        user1.setCreationTime(Date.valueOf(LocalDate.now()));
        user1.setUpdateTime(Date.valueOf(LocalDate.now()));

        System.out.println("---- Persisting user ----");
        test.save(user1);
        System.out.println(test.fetch(user1.getId()));

        User user2 = new User();
        //user2.setId(2);
        user2.setName("Marlene");
        user2.setEmail("marlene@marlene.com");
        user2.setPhone(912345678);
        user2.setCreationTime(Date.valueOf(LocalDate.now()));
        user2.setUpdateTime(Date.valueOf(LocalDate.now()));

        System.out.println("---- Persisting user ----");
        test.save(user2);
        System.out.println(test.fetch(user2.getId()));


        user2 = new User();
        //user2.setId(2);
        user2.setName("Marlene2");
        user2.setEmail("marlene@marlene.com");
        user2.setPhone(912345678);
        user2.setCreationTime(Date.valueOf(LocalDate.now()));
        user2.setUpdateTime(Date.valueOf(LocalDate.now()));

        System.out.println("---- Persisting user ----");
        test.saveOrUpdate(user2);
        System.out.println(test.fetch(user2.getId()));
    }

    private void save(User user) {

        EntityManager em = emf.createEntityManager();

        try {
            if (user.getId() == null) {
                em.getTransaction().begin();
                em.persist(user);
                em.getTransaction().commit();
            }

        } catch (RollbackException ex) {
            em.getTransaction().rollback();

        } finally {
            em.close();
        }
    }


    private User fetch(Integer id) {

        EntityManager em = emf.createEntityManager();

        try {
            return em.find(User.class, id);

        } finally {
            if (em != null) {
                em.close();
            }
            em.close();
        }

    }


    public User saveOrUpdate(User user) {

        EntityManager em = emf.createEntityManager();

        try {
                em.getTransaction().begin(); // open transaction
                User savedUser = em.merge(user);
                em.getTransaction().commit(); // close transaction
                return savedUser;

        } catch (RollbackException ex) {

            // something went wrong, make sure db is consistent
            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
