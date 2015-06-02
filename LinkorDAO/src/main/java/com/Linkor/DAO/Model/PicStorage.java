package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PicStorage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5081419333407700331L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long picStorageUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long picStorageId;
	private String picStorageUrl;
	public long getPicStorageUUID() {
		return picStorageUUID;
	}
	public void setPicStorageUUID(long picStorageUUID) {
		this.picStorageUUID = picStorageUUID;
	}
	public long getPicStorageId() {
		return picStorageId;
	}
	public void setPicStorageId(long picStorageId) {
		this.picStorageId = picStorageId;
	}
	public String getPicStorageUrl() {
		return picStorageUrl;
	}
	public void setPicStorageUrl(String picStorageUrl) {
		this.picStorageUrl = picStorageUrl;
	}

	
}
