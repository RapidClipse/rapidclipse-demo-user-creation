package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Supplier.class)
public abstract class Supplier_ {

	public static volatile SingularAttribute<Supplier, String> country;
	public static volatile SingularAttribute<Supplier, Integer> supplierid;
	public static volatile SingularAttribute<Supplier, String> address;
	public static volatile SingularAttribute<Supplier, String> city;
	public static volatile SetAttribute<Supplier, Product> products;
	public static volatile SingularAttribute<Supplier, String> contactname;
	public static volatile SingularAttribute<Supplier, String> phone;
	public static volatile SingularAttribute<Supplier, String> companyname;
	public static volatile SingularAttribute<Supplier, String> contacttitle;
	public static volatile SingularAttribute<Supplier, String> postalcode;
	public static volatile SingularAttribute<Supplier, String> region;
	public static volatile SingularAttribute<Supplier, String> fax;
	public static volatile SingularAttribute<Supplier, String> homepage;

}

