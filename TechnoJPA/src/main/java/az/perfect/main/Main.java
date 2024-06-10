/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package az.perfect.main;

import az.perfect.config.AbstractDao;
import az.perfect.config.Context;
import az.perfect.entity.Category;
import java.util.List;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(Context.instanceCountry().getAllCountrys());
        AbstractDao.closeEMF();
        
        char a=65;
        System.out.println(a);
    }
}
