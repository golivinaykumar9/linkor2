package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity 
public class AddRequestUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8497782638568973259L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addRequestUserUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addRequestUserId;
	@ManyToOne
	private UserDetails user;
	private String status;
	
	
	
	
	
	
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public long getAddRequestUserUUID() {
		return addRequestUserUUID;
	}
	public void setAddRequestUserUUID(long addRequestUserUUID) {
		this.addRequestUserUUID = addRequestUserUUID;
	}
	public long getAddRequestUserId() {
		return addRequestUserId;
	}
	public void setAddRequestUserId(long addRequestUserId) {
		this.addRequestUserId = addRequestUserId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
