package mum.ea.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import mum.ea.RideshareApplication;
import mum.ea.dao.UserDao;
import mum.ea.model.User;

public class UserDaoImpl implements UserDao {

	public void addUser(User u) {
		// TODO Auto-generated method stub
		Session session  = RideshareApplication.getSession().openSession();		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();					
			
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
