package mum.ea;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.annotations.reflection.XMLContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import mum.ea.model.User;



public class RideshareApplication {

	
		
  
	
    private static SessionFactory sf;
	public static SessionFactory getSession(){		
		if(sf == null){
			try {
				Configuration cong = new Configuration();
				sf = cong.configure().buildSessionFactory();
			} catch (Exception ex) { 
				System.out.println(ex);
			}
		}
		return sf;		
	}
	

	public  RideshareApplication(){
		
	}
	 
}


