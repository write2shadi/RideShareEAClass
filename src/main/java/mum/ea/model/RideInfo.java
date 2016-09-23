package mum.ea.model;


import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RideInfo {
	@Id
	@GeneratedValue
	private int rideId;
	
	@ManyToOne
	private User user;
	
	@Embedded
	private Address pickUpAddress;
	
	@Embedded
	private Address dropOffAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date pickUpDateAndTime;
	
	private String description;
	
	public RideInfo(){
		
	}

	public int getRideId() {
		return rideId;
	}

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getPickUpAddress() {
		return pickUpAddress;
	}

	public void setPickUpAddress(Address pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}

	public Address getDropOffAddress() {
		return dropOffAddress;
	}

	public void setDropOffAddress(Address dropOffAddress) {
		this.dropOffAddress = dropOffAddress;
	}

	public Date getPickUpDateAndTime() {
		return pickUpDateAndTime;
	}

	public void setPickUpDateAndTime(Date pickUpDateAndTime) {
		this.pickUpDateAndTime = pickUpDateAndTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
