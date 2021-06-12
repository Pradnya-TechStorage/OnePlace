package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		UserBean bean = new UserBean();
		bean.setId(101);
		bean.setName("Pradnya");
		bean.setRole("Software Engineer");
		session.save(bean);
		
		UserBean bean1 = session.get(UserBean.class,101);

		/*
		 * UserBean bean2 = session.get(UserBean.class, 101); System.out.println(bean2);
		 */
		tx.commit();
	}

}
