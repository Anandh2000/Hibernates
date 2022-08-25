package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberDelete {

	public static void main(String[] args) {
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Clerk.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Clerk cl =new Clerk();
		cl.setId(2);
		s.delete(cl);
		Transaction t = s.beginTransaction();
		t.commit();
		s.close();
		System.out.println(cl);

	}

}
