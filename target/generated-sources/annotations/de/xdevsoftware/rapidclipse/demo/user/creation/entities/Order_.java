package de.xdevsoftware.rapidclipse.demo.user.creation.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Shipper> shipper;
	public static volatile SingularAttribute<Order, String> shippostalcode;
	public static volatile SingularAttribute<Order, String> shipcountry;
	public static volatile SingularAttribute<Order, Integer> orderid;
	public static volatile SingularAttribute<Order, BigDecimal> freight;
	public static volatile SingularAttribute<Order, String> shipaddress;
	public static volatile SingularAttribute<Order, Date> shippeddate;
	public static volatile SingularAttribute<Order, Employee> employee;
	public static volatile SingularAttribute<Order, Date> orderdate;
	public static volatile SingularAttribute<Order, String> shipcity;
	public static volatile SingularAttribute<Order, String> shipregion;
	public static volatile SetAttribute<Order, Orderdetail> orderdetails;
	public static volatile SingularAttribute<Order, Date> requireddate;
	public static volatile SingularAttribute<Order, String> shipname;
	public static volatile SingularAttribute<Order, Customer> customer;

}

