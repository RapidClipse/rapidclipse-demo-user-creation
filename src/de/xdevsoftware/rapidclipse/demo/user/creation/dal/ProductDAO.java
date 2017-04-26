
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import com.xdev.dal.JPADAO;
import java.lang.Integer;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Product;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}