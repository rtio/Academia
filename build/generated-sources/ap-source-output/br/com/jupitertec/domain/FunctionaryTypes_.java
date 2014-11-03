package br.com.jupitertec.domain;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FunctionaryTypes.class)
public abstract class FunctionaryTypes_ {

	public static volatile CollectionAttribute<FunctionaryTypes, Functionary> functionaryCollection;
	public static volatile SingularAttribute<FunctionaryTypes, Integer> functionaryTypeId;
	public static volatile SingularAttribute<FunctionaryTypes, String> functionaryTypeName;

}

