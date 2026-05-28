package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestMyUserDemo {

	public static void main(String[] args) {
		//create connection with database by using hibernate.cfg.xml
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//if your file name is other than hibernate.cfg.xml the add it in the cofiguration method
		//SessionFactory sf=new Configuration().configure("myconfig.xml").buildSessionFactory();
		//u1 and u2 are in transient state
		MyUser u1=new MyUser(11,"Asit","222222","dd@gamil.com");
		MyUser u2=new MyUser(12,"Shashi","3333333","cc@gamil.com");
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//session.save(u1);
		//u1 and u2 are in persistent state
		
		session.persist(u1);
		session.persist(u2);
		tr.commit();
		session.close();
		//retrieve the data
		Session session1=sf.openSession();
		Transaction tr1=session.beginTransaction();
		//MyUSer u11=session1.get(MyUSer.class, 2);
		System.out.println("before find");
		//early binding , egar fetchtype
		MyUser u3=session.find(MyUser.class,2);
		System.out.println("After find");
		if(u3!=null)
		{
			System.out.println(u3);
		}
		else
		{
			System.out.println("not found");
		}
		tr1.commit();
		session1.close();
		sf.close();

	}

}
