package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7973907484297522728L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminDetailsUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminDetailsId;
	private String adminDetailsUserName;
	public long getAdminDetailsUUID() {
		return adminDetailsUUID;
	}
	public void setAdminDetailsUUID(long adminDetailsUUID) {
		this.adminDetailsUUID = adminDetailsUUID;
	}
	public long getAdminDetailsId() {
		return adminDetailsId;
	}
	public void setAdminDetailsId(long adminDetailsId) {
		this.adminDetailsId = adminDetailsId;
	}
	public String getAdminDetailsUserName() {
		return adminDetailsUserName;
	}
	public void setAdminDetailsUserName(String adminDetailsUserName) {
		this.adminDetailsUserName = adminDetailsUserName;
	}
	
	
}
