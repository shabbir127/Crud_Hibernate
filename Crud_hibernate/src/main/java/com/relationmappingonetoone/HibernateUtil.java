package com.relationmappingonetoone;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory==null) {
			Configuration configuration=new Configuration();
			Properties properties=new Properties();
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/db");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "12345");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(EmpDtls.class);
			configuration.addAnnotatedClass(Address.class);
			
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		}
		
		return sessionFactory;
	}

}
