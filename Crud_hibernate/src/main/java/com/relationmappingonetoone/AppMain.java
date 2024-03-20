package com.relationmappingonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppMain {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		//System.out.println(factory);
//		Address ad=new Address();
//		ad.setId(101);
//		ad.setAddress("chennai");
//		
//		EmpDtls e=new EmpDtls();
//		e.setId(2);
//		e.setName("jackson");
//		e.setAddress(ad);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
//		
//		session.save(ad);
//		session.save(e);
//		
		EmpDtls empDtls=session.get(EmpDtls.class, 2);
		System.out.println(empDtls.getName());
		System.out.println(empDtls.getAddress().getAddress());
	
		Address ad=session.get(Address.class, 101);
		System.out.println(ad.getEmpDtls().getName());
		tx.commit();
		session.close();
System.out.println("successfully");		
		factory.close();
		
		
	}
}
