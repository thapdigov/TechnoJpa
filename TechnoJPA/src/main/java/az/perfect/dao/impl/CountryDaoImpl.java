/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.entity.Country;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import az.perfect.dao.inter.CountryDaoInter;

/**
 *
 * @author Behruz Tapdiqov
 */
public class CountryDaoImpl extends AbstractDao implements CountryDaoInter {

    @Override
    public void update(Country p) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public void insert(Country p) {

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
        Country c = em.find(Country.class, id);
        em.remove(c);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public Country getCountry(int id) {
        EntityManager em = createEM();
        Query q = em.createQuery("select p from Country p where p.countryId=:x ");
        q.setParameter("x", id);
        Country c = (Country) q.getSingleResult();
        return c;

    }

    @Override
    public List<Country> getAllCountrys() {

        EntityManager em = createEM();
        List<Country> list = em.createNamedQuery("Country.findAll").getResultList();
        closeEM(em);
        return list;

    }
}
