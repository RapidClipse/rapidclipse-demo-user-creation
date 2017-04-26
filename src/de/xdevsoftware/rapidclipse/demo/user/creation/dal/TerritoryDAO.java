
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Territory;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}