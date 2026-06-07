package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Student;

public class InsertStudent {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration();

        cfg.configure();

        SessionFactory sf =
                cfg.buildSessionFactory();

        Session session =
                sf.openSession();

        Transaction tx =
                session.beginTransaction();

        Student s =
                new Student(
                        101,
                        "Asit",
                        89.5);

        session.persist(s);

        tx.commit();

        session.close();

        sf.close();

        System.out.println(
                "Student Inserted Successfully");
    }
}