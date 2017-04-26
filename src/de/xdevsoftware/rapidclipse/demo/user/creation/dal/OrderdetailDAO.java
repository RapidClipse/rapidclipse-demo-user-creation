
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.OrderdetailId;
import com.xdev.dal.JPADAO;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Orderdetail;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}