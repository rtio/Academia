package br.com.jupitertec.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Functionary.class)
public abstract class Functionary_ {

	public static volatile SingularAttribute<Functionary, FunctionaryTypes> functionaryTypeId;
	public static volatile SingularAttribute<Functionary, People> peopleId;
	public static volatile SingularAttribute<Functionary, Long> functionaryBiometry;
	public static volatile SingularAttribute<Functionary, Integer> functionaryId;

}

