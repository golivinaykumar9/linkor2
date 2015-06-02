package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7799434878220051322L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userPostUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userPostId;
	private String userPostDesc;
	private Date userPostedOn;
	@ManyToOne
	private UserDetails user;
	private boolean secrect;
	@OneToMany
	private List<Comment> userPostComment;
	@ManyToOne
	private Group group;
	
	
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public boolean isSecrect() {
		return secrect;
	}
	public void setSecrect(boolean secrect) {
		this.secrect = secrect;
	}
	public long getUserPostUUID() {
		return userPostUUID;
	}
	public void setUserPostUUID(long userPostUUID) {
		this.userPostUUID = userPostUUID;
	}
	public long getUserPostId() {
		return userPostId;
	}
	public void setUserPostId(long userPostId) {
		this.userPostId = userPostId;
	}
	public String getUserPostDesc() {
		return userPostDesc;
	}
	public void setUserPostDesc(String userPostDesc) {
		this.userPostDesc = userPostDesc;
	}
	public Date getUserPostedOn() {
		return userPostedOn;
	}
	public void setUserPostedOn(Date userPostedOn) {
		this.userPostedOn = userPostedOn;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public List<Comment> getUserPostComment() {
		return userPostComment;
	}
	public void setUserPostComment(List<Comment> userPostComment) {
		this.userPostComment = userPostComment;
	}
	
	
	
	

}
