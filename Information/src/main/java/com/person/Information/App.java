package com.person.Information;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        SessionFactory factory1 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        Session session1 = factory1.getCurrentSession();
//        Transaction ts1 = session1.beginTransaction();
//        Person ps = new Person();
//        ps.setId(2);
//        ps.setName("rmn");
//        
//       
//        Adhar ad = new Adhar();
//        ad.setAdharnum(1237687);
//        ad.setCity("pune");
//        ps.setAdhar_detail(ad);
//        
//        session1.merge(ad);
//        session1.merge(ps);
//        
//        //session1.remove(ad);
//      //  session1.persist(ps);
//         // session1.save(ps);
//        //session1.delete(ad);
    	
    	
    	//***********catches************************//
    	SessionFactory factory1 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session1 = factory1.openSession();
        Person person = session1.get(Person.class, 2);
        System.out.println(person.getName());
        
        System.out.println("*******************************************************************");
    	Person person2 = session1.get(Person.class, 2);
    	System.out.println(person2.getName());
    	session1.close();
       // ts1.commit();
        System.out.println("done");
        factory1.close();
        session1.close();
    }
}
