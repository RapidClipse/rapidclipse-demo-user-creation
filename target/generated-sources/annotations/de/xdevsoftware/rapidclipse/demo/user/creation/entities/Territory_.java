package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Territory.class)
public abstract class Territory_ {

	public static volatile SingularAttribute<Territory, String> territoryid;
	public static volatile SingularAttribute<Territory, String> territorydescription;
	public static volatile SingularAttribute<Territory, Region> region;
	public static volatile SetAttribute<Territory, Employee> employees;

}

