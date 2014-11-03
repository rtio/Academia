package br.com.jupitertec.domain;

import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(People.class)
public abstract class People_ {

	public static volatile CollectionAttribute<People, Functionary> functionaryCollection;
	public static volatile SingularAttribute<People, City> cityId;
	public static volatile CollectionAttribute<People, Client> clientCollection;
	public static volatile SingularAttribute<People, Integer> peopleId;
	public static volatile SingularAttribute<People, String> peopleName;
	public static volatile SingularAttribute<People, String> peopleCpf;
	public static volatile SingularAttribute<People, String> peopleMail;
	public static volatile SingularAttribute<People, String> peoplePhoto;
	public static volatile SingularAttribute<People, String> peopleComplement;
	public static volatile SingularAttribute<People, String> peopleEnd;
	public static volatile SingularAttribute<People, Date> peopleNasc;
	public static volatile SingularAttribute<People, String> peopleDistrict;
	public static volatile SingularAttribute<People, String> peopleCep;
	public static volatile SingularAttribute<People, String> peopleSex;
	public static volatile SingularAttribute<People, String> peopleRg;

}

