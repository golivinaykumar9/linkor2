package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResumeTemplete implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3042359010907465079L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long resumeUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long resumeId;
	private String resumeStyle;
	private UserDetails user;
	public long getResumeUUID() {
		return resumeUUID;
	}
	public void setResumeUUID(long resumeUUID) {
		this.resumeUUID = resumeUUID;
	}
	public long getResumeId() {
		return resumeId;
	}
	public void setResumeId(long resumeId) {
		this.resumeId = resumeId;
	}
	public String getResumeStyle() {
		return resumeStyle;
	}
	public void setResumeStyle(String resumeStyle) {
		this.resumeStyle = resumeStyle;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
	
}
