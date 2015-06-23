package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Events implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3010905146384545436L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long eventId;
	private Date eventOn;
	private String eventDesc;
	
		public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public Date getEventOn() {
		return eventOn;
	}
	public void setEventOn(Date eventOn) {
		this.eventOn = eventOn;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	

}
