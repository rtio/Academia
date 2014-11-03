package br.com.jupitertec.domain;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Operator.class)
public abstract class Operator_ {

	public static volatile SingularAttribute<Operator, String> operatorName;
	public static volatile SingularAttribute<Operator, Integer> operatorId;
	public static volatile CollectionAttribute<Operator, Telephone> telephoneCollection;

}

