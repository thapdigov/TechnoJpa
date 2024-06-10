/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Behruz Tapdiqov
 */
public abstract class AbstractDao {

    public static EntityManagerFactory emf = null;

    public static EntityManager createEM() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("az.perfect_TechnoJPA_jar_1.0PU");
        }
        return emf.createEntityManager();
    }

    public static void closeEM(EntityManager em) {
        em.close();
    }

    public static void closeEMF() {
        emf.close();
    }

}
