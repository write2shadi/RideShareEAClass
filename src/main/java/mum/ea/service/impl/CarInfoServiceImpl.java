package mum.ea.service.impl;

import mum.ea.dao.CarInfoDao;
import mum.ea.model.CarInfo;
import mum.ea.service.CarInfoService;
import org.springframework.transaction.annotation.Transactional;

public class CarInfoServiceImpl implements CarInfoService{

	
	private CarInfoDao carInfoDao;

    public CarInfoServiceImpl(CarInfoDao carInfoDao) {
        this.carInfoDao=carInfoDao;
    }

	@Override
	@Transactional
	public void addCarInfo(CarInfo carInfo) {
		// TODO Auto-generated method stub
		this.carInfoDao.addCarInfo(carInfo);
		
	}

}
