package com;

import java.util.Date;
import org.hibernate.Session;
import com.Pattern.SessionFactory.HibernateSessionFactory;
import com.bean.BeanRepresentingTable;

public class HelloWorld {

	public static void main(String[] args) {
		BeanRepresentingTable brt ;
		Session session = new HibernateSessionFactory().getSession();
		session.beginTransaction();
		for(int index = 0 ; index < 10 ; index++){
			brt = new BeanRepresentingTable();
			brt.setDate(new Date());
			brt.setIdKey(Math.round((float)Math.random()*10000));
			session.save(brt);
			try{
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		session.getTransaction().commit();
	}

}
