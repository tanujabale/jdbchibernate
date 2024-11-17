package com.person.Information;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App2{
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session =factory.getCurrentSession();
		//Session session = factory.openSession();
      Transaction ts = session.beginTransaction();
        Contact cn = new Contact();
        cn.setContactid(1);
        cn.setContactNum(1256);
        
        Contact cnn = new Contact();
        cnn.setContactid(2);
        cnn.setContactNum(873);
        
        Contact cn2 = new Contact();
        cn2.setContactid(3);
        cn2.setContactNum(542367);
        
        Contact cn3 = new Contact();
        cn3.setContactid(4);
        cn3.setContactNum(9856432);
        
        List<Contact>contactlist=new ArrayList<Contact>();
        contactlist.add(cn);
        contactlist.add(cnn);
        contactlist.add(cn2);
        contactlist.add(cn3);
        
        Voter vt = new Voter();
        vt.setId2(1);
        vt.setName("riya");
        vt.setContact(contactlist);
        
        
        cn.setVoter(vt);
        cnn.setVoter(vt);
        cn2.setVoter(vt);
        cn3.setVoter(vt);
        session.save(vt);
        session.save(cn);
        session.save(cnn);
        session.save(cn2);
        session.save(cn3);
//        Voter voter=session.get(Voter.class,1);
////        ArrayList <Contact>list=new ArrayList<Contact>();
//        //ts.commit();
        
//        Query q = session.createQuery("from Voter where id=1");
//        List <Voter>li=q.list();
//        
//        for(Voter vt:li) {
//        	System.out.println(vt.getName());
//        }
        //-------------------for user input--------------//
//        Scanner sc = new Scanner(System.in);
//        int ch =sc.nextInt();
//        Query q =session.createQuery("from Voter where id= :ch");
//        q.setParameter("ch", ch);
//        List <Contact>list=q.list();
//        for(Contact vt :list) {
//        	System.out.println(vt.getContactid());
//        }
//        Scanner sc = new Scanner(System.in);
//        int ch =sc.nextInt();
//        Query q =session.createQuery("from Voter v where v.contactid= :ch");
//        q.setParameter("ch", ch);
//        
//        List<Voter>voters=q.list();
//        for(Voter vt:voters) {
//        	Contact ct = vt.getContact()
//        	System.out.println(vt.getName()+"Contact num"+ct.getContactNum());
//        }
        ts.commit();
        System.out.println("done");
        session.close();
        factory.close();
	}

}
