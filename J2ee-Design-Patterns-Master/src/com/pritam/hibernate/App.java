package com.pritam.hibernate;

import org.hibernate.Session;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		System.out.println(session);
	}
}
