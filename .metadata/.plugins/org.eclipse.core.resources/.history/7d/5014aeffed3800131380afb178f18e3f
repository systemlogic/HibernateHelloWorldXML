package com.Pattern.SessionFactory;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionFactory {
	private Session session;
	
	public Session getSession() {
		return session;
	}
	@SuppressWarnings("deprecation")
	public HibernateSessionFactory() {
		session = new AnnotationConfiguration().configure("cusotmhibernate.cfg.xml").buildSessionFactory().openSession();
		//session = new AnnotationConfiguration().configure().buildSessionFactory().openSession(); In case File name is hibernate.cfg.xml
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		session = null;
	}

}
