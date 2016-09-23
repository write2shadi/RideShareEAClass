package mum.ea.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private User user;
	

	@ManyToOne
	private RideInfo ride;
	
	private Date timeOfBooking;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RideInfo getRide() {
		return ride;
	}

	public void setRide(RideInfo ride) {
		this.ride = ride;
	}

	public Date getTimeOfBooking() {
		return timeOfBooking;
	}

	public void setTimeOfBooking(Date timeOfBooking) {
		this.timeOfBooking = timeOfBooking;
	}
	
	

}
