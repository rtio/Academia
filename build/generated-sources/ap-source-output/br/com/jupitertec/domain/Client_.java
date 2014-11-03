package br.com.jupitertec.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Client.class)
public abstract class Client_ {

	public static volatile SingularAttribute<Client, String> clientPassword;
	public static volatile SingularAttribute<Client, Long> clientBiometry;
	public static volatile SingularAttribute<Client, People> peopleId;
	public static volatile SingularAttribute<Client, Boolean> clientStatus;
	public static volatile SingularAttribute<Client, String> clientObs;
	public static volatile SingularAttribute<Client, Integer> clientId;

}

