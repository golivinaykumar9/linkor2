package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Education implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250730770346839896L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long educationUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long educationId;
	private String educationSchoolName;
	private String educationZone;
	private Date educationStart;
	private Date educationEnd;
	private boolean educationCompleted;
	private String educationDescription;
	@ManyToOne
	private UserDetails user;
	
	
	
	
	
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public long getEducationUUID() {
		return educationUUID;
	}
	public void setEducationUUID(long educationUUID) {
		this.educationUUID = educationUUID;
	}
	public long getEducationId() {
		return educationId;
	}
	public void setEducationId(long educationId) {
		this.educationId = educationId;
	}
	public String getEducationSchoolName() {
		return educationSchoolName;
	}
	public void setEducationSchoolName(String educationSchoolName) {
		this.educationSchoolName = educationSchoolName;
	}
	public String getEducationZone() {
		return educationZone;
	}
	public void setEducationZone(String educationZone) {
		this.educationZone = educationZone;
	}
	public Date getEducationStart() {
		return educationStart;
	}
	public void setEducationStart(Date educationStart) {
		this.educationStart = educationStart;
	}
	public Date getEducationEnd() {
		return educationEnd;
	}
	public void setEducationEnd(Date educationEnd) {
		this.educationEnd = educationEnd;
	}
	public boolean isEducationCompleted() {
		return educationCompleted;
	}
	public void setEducationCompleted(boolean educationCompleted) {
		this.educationCompleted = educationCompleted;
	}
	public String getEducationDescription() {
		return educationDescription;
	}
	public void setEducationDescription(String educationDescription) {
		this.educationDescription = educationDescription;
	}
	
	
	

}
