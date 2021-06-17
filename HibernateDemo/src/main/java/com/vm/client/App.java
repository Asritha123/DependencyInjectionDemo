package com.vm.client;
import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Employee;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setName("asritha");
		emp.setDept("developer");
		session.save(emp);
		transaction.commit();
		
		

	}

}
