package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> country;
	public static volatile SingularAttribute<Employee, String> firstname;
	public static volatile SingularAttribute<Employee, String> extension;
	public static volatile SingularAttribute<Employee, Date> birthdate;
	public static volatile SingularAttribute<Employee, String> address;
	public static volatile SingularAttribute<Employee, String> notes;
	public static volatile SingularAttribute<Employee, String> homephone;
	public static volatile SingularAttribute<Employee, String> city;
	public static volatile SingularAttribute<Employee, byte[]> photo;
	public static volatile SingularAttribute<Employee, Employee> employee;
	public static volatile SingularAttribute<Employee, String> title;
	public static volatile SingularAttribute<Employee, Double> salary;
	public static volatile SingularAttribute<Employee, Integer> employeeid;
	public static volatile SingularAttribute<Employee, Date> hiredate;
	public static volatile SingularAttribute<Employee, String> lastname;
	public static volatile SetAttribute<Employee, Territory> territories;
	public static volatile SingularAttribute<Employee, String> postalcode;
	public static volatile SingularAttribute<Employee, String> photopath;
	public static volatile SingularAttribute<Employee, String> titleofcourtesy;
	public static volatile SetAttribute<Employee, Order> orders;
	public static volatile SingularAttribute<Employee, String> region;
	public static volatile SetAttribute<Employee, Employee> employees;

}

