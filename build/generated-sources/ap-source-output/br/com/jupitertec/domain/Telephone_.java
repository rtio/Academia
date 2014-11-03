package br.com.jupitertec.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Telephone.class)
public abstract class Telephone_ {

	public static volatile SingularAttribute<Telephone, Operator> operatorId;
	public static volatile SingularAttribute<Telephone, Integer> telephoneId;
	public static volatile SingularAttribute<Telephone, TelephoneTypes> telephoneTypeId;
	public static volatile SingularAttribute<Telephone, String> telephoneNumber;

}

