package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> country;
	public static volatile SingularAttribute<Customer, String> address;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SetAttribute<Customer, Customerdemographic> customerdemographics;
	public static volatile SingularAttribute<Customer, String> contactname;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> companyname;
	public static volatile SingularAttribute<Customer, String> contacttitle;
	public static volatile SingularAttribute<Customer, String> postalcode;
	public static volatile SingularAttribute<Customer, String> customerid;
	public static volatile SetAttribute<Customer, Order> orders;
	public static volatile SingularAttribute<Customer, String> region;
	public static volatile SingularAttribute<Customer, String> fax;

}

