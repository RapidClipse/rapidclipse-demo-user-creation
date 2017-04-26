package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, Integer> productid;
	public static volatile SingularAttribute<Product, String> quantityperunit;
	public static volatile SingularAttribute<Product, Short> reorderlevel;
	public static volatile SingularAttribute<Product, Supplier> supplier;
	public static volatile SingularAttribute<Product, Short> unitsonorder;
	public static volatile SingularAttribute<Product, String> productname;
	public static volatile SetAttribute<Product, Orderdetail> orderdetails;
	public static volatile SingularAttribute<Product, Boolean> discontinued;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile SingularAttribute<Product, BigDecimal> unitprice;
	public static volatile SingularAttribute<Product, Short> unitsinstock;

}

