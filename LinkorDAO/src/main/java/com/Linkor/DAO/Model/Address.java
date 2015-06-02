package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1769259447425775299L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addressUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addressId;
	private String address1;
	private String address2;
	private String addressState;
	private String addressCountry;
	private int addressZipCode;
	@ManyToOne
	private UserDetails user;
	public long getAddressUUID() {
		return addressUUID;
	}
	public void setAddressUUID(long addressUUID) {
		this.addressUUID = addressUUID;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public int getAddressZipCode() {
		return addressZipCode;
	}
	public void setAddressZipCode(int addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
}
