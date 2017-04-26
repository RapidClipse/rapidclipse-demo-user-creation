
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import com.xdev.dal.JPADAO;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Customer;

/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends JPADAO<Customer, String> {
	public CustomerDAO() {
		super(Customer.class);
	}
}