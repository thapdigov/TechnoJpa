/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.CategoryDaoInter;
import az.perfect.entity.Category;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Behruz Tapdiqov
 */
public class CategoryDaoImpl extends AbstractDao implements CategoryDaoInter {

    @Override
    public void update(Category p) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public void insert(Category p) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public void delete(int id) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        Category c = em.find(Category.class, id);
        em.remove(c);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public Category getCategory(int id) {
        EntityManager em = createEM();
        Query q = em.createQuery("select p from Category p where p.categoryId=:x");
        q.setParameter("x", id);
        Category c = (Category) q.getSingleResult();
        return c;

    }

    @Override
    public List<Category> getAllCategorys() {

        EntityManager em = createEM();
        List<Category> list = em.createNamedQuery("Category.findAll").getResultList();
        closeEM(em);
        return list;

    }

}


