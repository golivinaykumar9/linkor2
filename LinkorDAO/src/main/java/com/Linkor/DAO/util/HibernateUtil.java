package com.Linkor.DAO.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}catch(Throwable ex){
			System.err.println("Initial sessionfsctory crested failed");
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static SessionFactory	 getSessionFactory() {
		return sessionFactory;
		
	}

}
