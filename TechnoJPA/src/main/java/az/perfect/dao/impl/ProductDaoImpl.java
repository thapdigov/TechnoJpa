/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.ProductDaoInter;
import az.perfect.entity.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Behruz Tapdiqov
 */
public class ProductDaoImpl extends AbstractDao implements ProductDaoInter {

    @Override
    public void update(Product p) {

        EntityManager em = createEM();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        closeEM(em);
    }

    @Override
    public void insert(Product p) {

        EntityManager em = createEM();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        closeEM(em);
    }

    @Override
    public void delete(int id) {
        EntityManager em = createEM();
        Product p = em.find(Product.class, id);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        closeEM(em);
    }

    @Override
    public Product getProduct(int id) {
        EntityManager em = createEM();
        Query q = em.createQuery("select p from Product p where p.productId=:x");
        q.setParameter("x", id);
        Product p = (Product) q.getSingleResult();
        closeEM(em);
        return p;

    }

    @Override
    public List<Product> getAllProducts() {

        EntityManager em = createEM();
        List<Product> list = em.createNamedQuery("Product.findAll").getResultList();
        closeEM(em);
        return list;

    }

}
