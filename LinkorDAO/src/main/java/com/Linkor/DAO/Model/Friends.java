package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Friends implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5495610428203619587L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long friendId;
	@ManyToOne 
	@JoinColumn(name="user_id")
	private UserDetails user;
	@OneToMany
	private List<UserDetails> friends;
	
	
	public List<UserDetails> getFriends() {
		return friends;
	}
	public void setFriends(List<UserDetails> friends) {
		this.friends = friends;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String status;
	public long getFriendId() {
		return friendId;
	}
	public void setFriendId(long friendId) {
		this.friendId = friendId;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
