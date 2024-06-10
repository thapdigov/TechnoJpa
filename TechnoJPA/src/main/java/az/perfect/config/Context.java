/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.dao.impl.CategoryDaoImpl;
import az.perfect.dao.impl.CountryDaoImpl;
import az.perfect.dao.impl.ProductDaoImpl;
import az.perfect.dao.inter.CategoryDaoInter;
import az.perfect.dao.inter.CountryDaoInter;
import az.perfect.dao.inter.ProductDaoInter;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Context {

    public static ProductDaoInter instanceProduct() {
        return new ProductDaoImpl();
    }

    public static CountryDaoInter instanceCountry() {
        return new CountryDaoImpl();
    }

    public static CategoryDaoInter instanceCategory() {
        return new CategoryDaoImpl();
    }
}
