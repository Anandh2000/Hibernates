package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberUpdate {

	public static void main(String[] args) { //will update the values in the required position 
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Clerk.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Clerk cl =new Clerk();
		cl.setId(1);
		cl.setCname("carry minati");
		cl.setWork("pc gamming");
		s.update(cl);
		
		t.commit();
		s.close();
		System.out.println(cl);
	}

}
