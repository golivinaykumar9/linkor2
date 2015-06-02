package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProfilePic  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6930541288088531716L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ProfilePicUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ProfilePicId;
	private String ProfilePicURL;
	@ManyToOne
	private UserDetails user;
	public long getProfilePicUUID() {
		return ProfilePicUUID;
	}
	public void setProfilePicUUID(long profilePicUUID) {
		ProfilePicUUID = profilePicUUID;
	}
	public long getProfilePicId() {
		return ProfilePicId;
	}
	public void setProfilePicId(long profilePicId) {
		ProfilePicId = profilePicId;
	}
	public String getProfilePicURL() {
		return ProfilePicURL;
	}
	public void setProfilePicURL(String profilePicURL) {
		ProfilePicURL = profilePicURL;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
	
	

}
