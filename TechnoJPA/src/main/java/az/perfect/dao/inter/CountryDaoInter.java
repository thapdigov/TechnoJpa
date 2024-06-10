/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;
import az.perfect.entity.Country;
import java.util.List;

/**
 *
 * @author Behruz Tapdiqov
 */
public interface CountryDaoInter {

    void update(Country p);

    void insert(Country p);

    void delete(int id);

    Country getCountry(int id);

    List<Country> getAllCountrys();

}
