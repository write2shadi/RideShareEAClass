package mum.ea;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Person;

import edu.mum.hw2.control.EntityManager;
import edu.mum.hw2.control.EntityTransaction;
import edu.mum.hw2.control.Movie;



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
		
			/*p.setFirstname("stella");
			p.setLastname("Nshuti");
			p.setId((Integer) session.save(p));
			tx.commit();*/
			
			System.out.println("ID is:"+p.getId());
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
