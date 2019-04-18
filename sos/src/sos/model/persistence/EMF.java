package sos.model.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

private static EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("soshome");
	
	private EMF() {}
	
	public static EntityManagerFactory get() {
		return emfInstance;
	}
}
