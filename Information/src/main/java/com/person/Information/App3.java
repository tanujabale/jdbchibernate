package com.person.Information;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App3 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction ts = session.beginTransaction();
        
        Student sn = new Student();
        sn.setRollno(1);
        sn.setName("riya");
      
         Student sn1 = new Student();
         sn1.setRollno(2);
         sn1.setName("mrunali");
      
         Student sn2 = new Student();
         sn2.setRollno(3);
         sn2.setName("sneha");
         
         List<Student>sd=new ArrayList<Student>();
         sd.add(sn);
         sd.add(sn1);
         sd.add(sn2);
         
         
        Courses ces = new Courses();
        ces.setS_id(1);
        ces.setCoursename("Java");
        
        Courses ces1=new Courses();
        ces1.setS_id(2);
        ces1.setCoursename("Cpp");
        
        Courses ces2=new Courses();
        ces2.setS_id(3);
        ces2.setCoursename("c");
        
        
        List<Courses>css=new ArrayList<Courses>();
        css.add(ces);
        css.add(ces1);
        css.add(ces2);
        
        
        sn.setCourses(css);
        sn1.setCourses(css);
        sn2.setCourses(css);
         
        ces.setSt(sd);
        ces1.setSt(sd);
        ces2.setSt(sd);
         
         session.save(ces);
         session.save(ces1);
         session.save(ces2);
         session.save(sn);
         session.save(sn1);
         session.save(sn2);
         ts.commit();
         System.out.println("done");
         session.close();
         factory.close();
	}

}
