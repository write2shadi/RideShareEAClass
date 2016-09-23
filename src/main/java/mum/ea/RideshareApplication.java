package mum.ea;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mum.ea.model.User;



@SpringBootApplication
public class RideshareApplication {

	private static SessionFactory sf;
	static {
		try {
			Configuration cong = new Configuration();
			sf = cong.configure().buildSessionFactory();
		} catch (Exception ex) { 
			System.out.println(ex);
		}

	}	
	public static void main(String[] args) {
		// SpringApplication.run(RideshareApplication.class, args);
		
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
		
			User u = new User();
			u.setUsername("mizan");
			u.setPassword("123456");
			
			session.persist(u);

			tx.commit();
			
			System.out.println("ID is:"+u.getId());
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}


