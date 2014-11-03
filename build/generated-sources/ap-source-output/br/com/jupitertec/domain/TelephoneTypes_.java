package br.com.jupitertec.domain;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TelephoneTypes.class)
public abstract class TelephoneTypes_ {

	public static volatile SingularAttribute<TelephoneTypes, Integer> telephoneTypeId;
	public static volatile CollectionAttribute<TelephoneTypes, Telephone> telephoneCollection;
	public static volatile SingularAttribute<TelephoneTypes, String> telephoneTypeName;

}

