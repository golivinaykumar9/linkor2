package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Working implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5809974270537780255L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long workingUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long workingId;
	private String workingCompany;
	private String workingPosition;
	private String workingCityRTown;
	private String workingDescription;
	private Date workingStartDate;
	private Date workingEndDate;
	private boolean timePeriod;
	@ManyToOne
	private UserDetails user;
	public long getWorkingUUID() {
		return workingUUID;
	}
	public void setWorkingUUID(long workingUUID) {
		this.workingUUID = workingUUID;
	}
	public long getWorkingId() {
		return workingId;
	}
	public void setWorkingId(long workingId) {
		this.workingId = workingId;
	}
	public String getWorkingCompany() {
		return workingCompany;
	}
	public void setWorkingCompany(String workingCompany) {
		this.workingCompany = workingCompany;
	}
	public String getWorkingPosition() {
		return workingPosition;
	}
	public void setWorkingPosition(String workingPosition) {
		this.workingPosition = workingPosition;
	}
	public String getWorkingCityRTown() {
		return workingCityRTown;
	}
	public void setWorkingCityRTown(String workingCityRTown) {
		this.workingCityRTown = workingCityRTown;
	}
	public String getWorkingDescription() {
		return workingDescription;
	}
	public void setWorkingDescription(String workingDescription) {
		this.workingDescription = workingDescription;
	}
	public Date getWorkingStartDate() {
		return workingStartDate;
	}
	public void setWorkingStartDate(Date workingStartDate) {
		this.workingStartDate = workingStartDate;
	}
	public Date getWorkingEndDate() {
		return workingEndDate;
	}
	public void setWorkingEndDate(Date workingEndDate) {
		this.workingEndDate = workingEndDate;
	}
	public boolean isTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(boolean timePeriod) {
		this.timePeriod = timePeriod;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
	
	
	

}
