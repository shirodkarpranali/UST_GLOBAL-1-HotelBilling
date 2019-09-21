package com.ustglobal.HotelBilling;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnEstablish {
	static EntityManagerFactory factory=null;
	static EntityManager entityManager=null;
	static EntityTransaction transaction=null;
	
	
		
	public static EntityManager getConnection(){	
		factory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=factory.createEntityManager();
		//transaction=entityManager.getTransaction();
        return entityManager;
	}

}
