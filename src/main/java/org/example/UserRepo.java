package org.example;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import org.example.util.JPA;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {


        public boolean save(User user) throws IllegalArgumentException {
            EntityManager entityManager = JPA.getEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();

            if (!ifUserExists(user))
            {
                try {
                    transaction.begin();
                    entityManager.persist(user);
                    transaction.commit();
                } catch (Exception e) {
                    if (transaction.isActive()) {
                        transaction.rollback();
                    }
                    e.printStackTrace();
                    return false;

                } finally {
                    entityManager.close();
                    return true;
                }
            }
            else{
                throw new IllegalArgumentException("Der User existiert bereits");
            }

        }



        private boolean ifUserExists(User user){
           EntityManager em = JPA.getEntityManager();

           List existingUsers = em.createQuery("SELECT u FROM users u WHERE u.firstName = :firstName AND u.surName = :lastName AND u.email = :email")
                    .setParameter("firstName", user.getFirstName())
                   .setParameter("lastName", user.getSurName())
                   .setParameter("email", user.getEmail())
                   .getResultList();
            System.out.println("**********************************" + existingUsers);
           return !existingUsers.isEmpty(); //true if User does not exist


        }
        public List<User> getAllOrderedbyID() {
            EntityManager entityManager = JPA.getEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            List<User> UserList = new ArrayList<>();
            Query selectAll = entityManager.createQuery("SELECT u FROM users u"); //how to get access to table? Use OBJECT?
            UserList = selectAll.getResultList();



            return UserList;
        }


    }
