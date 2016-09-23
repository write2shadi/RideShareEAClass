package mum.ea.model;

import javax.persistence.*;

@Entity
public class CarInfo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String carMake;
	private String carModel;
	private int carYear;
	private String carColor;
	private String carType;
	
	public int getId() {
		return id;
	}
	
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
	
	

}