package br.com.jupitertec.domain;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile SingularAttribute<City, Integer> cityId;
	public static volatile SingularAttribute<City, String> cityName;
	public static volatile SingularAttribute<City, String> cityUf;
	public static volatile CollectionAttribute<City, People> peopleCollection;

}

