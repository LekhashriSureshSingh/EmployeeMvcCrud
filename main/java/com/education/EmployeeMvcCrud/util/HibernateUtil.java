package com.education.EmployeeMvcCrud.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.education.EmployeeMvcCrud.entities.Employee;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			// created configuration object
			Configuration conf = new Configuration();

			// specify conf for database ==> hibernate
			Properties settings = new Properties();

			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/java_programs?useSSL=false");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "mypass1234");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			settings.put(Environment.HBM2DDL_AUTO, "create-drop");

			// set all properties to configuration
			conf.setProperties(settings);

			conf.addAnnotatedClass(Employee.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties())
					.build();

			sessionFactory = conf.buildSessionFactory(serviceRegistry);

		}

		return sessionFactory;
	}

}

