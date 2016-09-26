package mum.ea.dao.impl;

import mum.ea.dao.CarInfoDao;
import mum.ea.model.CarInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CarInfoDaoImpl implements CarInfoDao{
	
	private static final Logger logger = LoggerFactory.getLogger(CarInfoDaoImpl.class);

	private SessionFactory sessionFactory;
	
    @Autowired
    public CarInfoDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
	@Override
	public void addCarInfo(CarInfo carInfo) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(carInfo);
		logger.info("Person saved successfully, Person Details="+carInfo);
	}

}
