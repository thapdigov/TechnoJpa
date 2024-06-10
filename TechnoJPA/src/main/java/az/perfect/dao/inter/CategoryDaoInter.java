/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Category;
import az.perfect.entity.Country;
import java.util.List;

/**
 *
 * @author Behruz Tapdiqov
 */
public interface CategoryDaoInter {

    void update(Category p);

    void insert(Category p);

    void delete(int id);

    Category getCategory(int id);

    List<Category> getAllCategorys();
}
