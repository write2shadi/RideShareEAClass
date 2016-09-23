package mum.ea.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
		
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;	
	private String role;
	private String username;
	private String password;
	
	
	@OneToMany(mappedBy="user")
	private List<CarInfo> caInfos = new ArrayList<>();
	
	@OneToMany(mappedBy="user")
	private List<RideInfo> rideinfos = new ArrayList<>();
	
	@OneToMany(mappedBy="user")
	private List<Booking> bookings = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RideInfo> getRideinfos() {
		return rideinfos;
	}
	public void setRideinfos(List<RideInfo> rideinfos) {
		this.rideinfos = rideinfos;
	}
	
	
}
