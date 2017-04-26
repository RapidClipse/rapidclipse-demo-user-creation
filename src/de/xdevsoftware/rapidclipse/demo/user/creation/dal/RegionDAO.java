
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import com.xdev.dal.JPADAO;
import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Region;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}