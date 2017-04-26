
package de.xdevsoftware.rapidclipse.demo.user.creation.dal;

import de.xdevsoftware.rapidclipse.demo.user.creation.entities.Employee;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends JPADAO<Employee, Integer> {
	public EmployeeDAO() {
		super(Employee.class);
	}
}