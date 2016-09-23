package mum.ea.model;


import java.util.Date;

import javax.persistence.*;

@Entity
public class RideInfo {
	@Id
	@GeneratedValue
	private int rideId;
	
	@ManyToOne
	private User user;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="PICKUP_STREET")),
		@AttributeOverride(name="city", column=@Column(name="PICKUP_CITY")),
		@AttributeOverride(name="state", column=@Column(name="PICKUP_STATE")),
		@AttributeOverride(name="zipCode", column=@Column(name="PICKUP_ZIP"))
	})
	private Address pickUpAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="DROPOFF_STREET")),
		@AttributeOverride(name="city", column=@Column(name="DROPOFF_CITY")),
		@AttributeOverride(name="state", column=@Column(name="DROPOFF_STATE")),
		@AttributeOverride(name="zipCode", column=@Column(name="DROPOFF_ZIP"))
	})
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
