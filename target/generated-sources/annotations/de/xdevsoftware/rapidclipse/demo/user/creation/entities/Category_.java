package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, String> description;
	public static volatile SingularAttribute<Category, String> categoryname;
	public static volatile SingularAttribute<Category, Integer> categoryid;
	public static volatile SingularAttribute<Category, byte[]> picture;
	public static volatile SetAttribute<Category, Product> products;

}

