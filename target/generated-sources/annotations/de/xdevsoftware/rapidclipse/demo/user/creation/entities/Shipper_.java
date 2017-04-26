package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Shipper.class)
public abstract class Shipper_ {

	public static volatile SingularAttribute<Shipper, Integer> shipperid;
	public static volatile SingularAttribute<Shipper, String> phone;
	public static volatile SingularAttribute<Shipper, String> companyname;
	public static volatile SetAttribute<Shipper, Order> orders;

}

