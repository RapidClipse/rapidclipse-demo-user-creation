
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Customerdemographic;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Customerdemographic.
 * 
 * @see Customerdemographic
 */
public class CustomerdemographicDAO extends JPADAO<Customerdemographic, String> {
	public CustomerdemographicDAO() {
		super(Customerdemographic.class);
	}
}