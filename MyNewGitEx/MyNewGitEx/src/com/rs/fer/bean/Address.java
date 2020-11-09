package com.rs.fer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table

public class Address {
	
	@Id
	@Column(name="addressid",length =10)
	private int addressid;
	
	
	@Column(name="line1",length=30)
	private String line1;
	
	@Column(name="line2",length=30)
	private String line2;
	
	@Column(name="city",length=10)
	private String city;
	
	@Column(name="state",length=20)
	private String state;
	
	@Column(name="pincode",length=10)
	private String pincode;
	
	@Column(name="country",length=10)
	private String country;
	
	
	
	@OneToOne
	@MapsId
	@JoinColumn(name ="addressid")
	private User user;
	
	@Column(name="created",length=10)
	private String created;
	
	@Column(name="updated",length=10)
	private String updated;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

}
	