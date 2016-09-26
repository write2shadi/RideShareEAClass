package mum.ea.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import mum.ea.RideshareApplication;
import mum.ea.dao.UserDao;
import mum.ea.model.User;

public class UserDaoImpl implements UserDao {

	// @PersistenceContext
	// private Sessio em;
	
	public void addUser(User u) {
		// TODO Auto-generated method stub
							
			
			// em.persist(u);

		
			System.out.println("ID is:"+u.getId());
			


	}

}
