package mum.ea.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import mum.ea.RideshareApplication;
import mum.ea.dao.UserDao;
import mum.ea.dao.impl.UserDaoImpl;
import mum.ea.model.User;
import mum.ea.service.UserService;

public class UserServiceImpl implements UserService {
	
	 @Autowired
	private UserDao userDao;
	
	public void registerUser(User u) {
		
		// userDao = new UserDaoImpl();
		// TODO Auto-generated method stub
		userDao.addUser(u);		
	}
	

}
