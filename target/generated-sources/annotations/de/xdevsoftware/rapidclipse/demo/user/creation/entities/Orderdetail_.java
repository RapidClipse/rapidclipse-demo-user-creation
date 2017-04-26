package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orderdetail.class)
public abstract class Orderdetail_ {

	public static volatile SingularAttribute<Orderdetail, Product> product;
	public static volatile SingularAttribute<Orderdetail, Short> quantity;
	public static volatile SingularAttribute<Orderdetail, Float> discount;
	public static volatile SingularAttribute<Orderdetail, OrderdetailId> id;
	public static volatile SingularAttribute<Orderdetail, BigDecimal> unitprice;
	public static volatile SingularAttribute<Orderdetail, Order> order;

}

