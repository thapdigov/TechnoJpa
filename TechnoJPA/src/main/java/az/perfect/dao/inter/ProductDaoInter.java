/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;
import az.perfect.entity.Product;
import java.util.List;

/**
 *
 * @author Behruz Tapdiqov
 */
public interface ProductDaoInter {

    void update(Product p);

    void insert(Product p);

    void delete(int id);

    Product getProduct(int id);

    List<Product> getAllProducts();

}
