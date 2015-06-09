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
@Entity
public class Friends implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5495610428203619587L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long friendUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long friendId;
	@ManyToOne

	private UserDetails user;
	@OneToMany
	private List<UserDetails> addFriends;
	private String status;
	public long getFriendUUID() {
		return friendUUID;
	}
	public void setFriendUUID(long friendUUID) {
		this.friendUUID = friendUUID;
	}
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
	public List<UserDetails> getAddFriends() {
		return addFriends;
	}
	public void setAddFriends(List<UserDetails> addFriends) {
		this.addFriends = addFriends;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
