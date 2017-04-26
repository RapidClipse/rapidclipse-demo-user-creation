
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Category;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JPADAO<Category, Integer> {
	public CategoryDAO() {
		super(Category.class);
	}
}