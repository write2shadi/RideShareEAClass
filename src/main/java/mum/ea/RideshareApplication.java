package mum.ea;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.hw2.control.EntityManager;
import edu.mum.hw2.control.EntityTransaction;
import edu.mum.hw2.control.Movie;



@SpringBootApplication
public class RideshareApplication {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("RideShareDB");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) {
		// SpringApplication.run(RideshareApplication.class, args);
		


	}
}
