
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import com.xdev.dal.JPADAO;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Shipper;
import java.lang.Integer;

/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JPADAO<Shipper, Integer> {
	public ShipperDAO() {
		super(Shipper.class);
	}
}