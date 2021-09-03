package com.education.EmployeeMvcCrud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.education.EmployeeMvcCrud.entities.Employee;
import com.education.EmployeeMvcCrud.util.HibernateUtil;

public class Employeedao {

	public void saveStudent(Employee employee) {
		Transaction transaction = null;

		System.out.println("Hibernate Util "+employee);
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();

			// save student object
			session.save(employee);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
	public void deleteStudent(Employee employee) {
		Transaction transaction = null;

		System.out.println("Hibernate Util "+employee);
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start transaction
			transaction = session.beginTransaction();

			// save student object
			session.delete(employee);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
	
	public List<Employee> getStudents()
	{
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			System.out.println(session);
			return session.createQuery("From Employee",Employee.class).list();
		}
		
	}

}
