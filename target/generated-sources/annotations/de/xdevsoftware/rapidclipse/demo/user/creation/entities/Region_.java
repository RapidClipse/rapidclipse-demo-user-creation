package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Region.class)
public abstract class Region_ {

	public static volatile SingularAttribute<Region, String> regiondescription;
	public static volatile SetAttribute<Region, Territory> territories;
	public static volatile SingularAttribute<Region, Integer> regionid;

}

