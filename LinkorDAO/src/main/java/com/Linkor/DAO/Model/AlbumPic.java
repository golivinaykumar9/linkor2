package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AlbumPic implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5732395571552261880L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long albumPicUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long albumPicId;
	private String albumPicUrl;
	public long getAlbumPicUUID() {
		return albumPicUUID;
	}
	public void setAlbumPicUUID(long albumPicUUID) {
		this.albumPicUUID = albumPicUUID;
	}
	public long getAlbumPicId() {
		return albumPicId;
	}
	public void setAlbumPicId(long albumPicId) {
		this.albumPicId = albumPicId;
	}
	public String getAlbumPicUrl() {
		return albumPicUrl;
	}
	public void setAlbumPicUrl(String albumPicUrl) {
		this.albumPicUrl = albumPicUrl;
	}
	
	

}
