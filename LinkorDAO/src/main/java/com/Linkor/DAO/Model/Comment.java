package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Comment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2235065202395773163L;
		@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userPostCommentId;
	private String userPostCommentDesc;
	private Date userPostCommentedOn;
	@ManyToOne
	private UserDetails user;
	@ManyToOne
	private Post userPost;
	public long getUserPostCommentId() {
		return userPostCommentId;
	}
	public void setUserPostCommentId(long userPostCommentId) {
		this.userPostCommentId = userPostCommentId;
	}
	public String getUserPostCommentDesc() {
		return userPostCommentDesc;
	}
	public void setUserPostCommentDesc(String userPostCommentDesc) {
		this.userPostCommentDesc = userPostCommentDesc;
	}
	public Date getUserPostCommentedOn() {
		return userPostCommentedOn;
	}
	public void setUserPostCommentedOn(Date userPostCommentedOn) {
		this.userPostCommentedOn = userPostCommentedOn;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public Post getUserPost() {
		return userPost;
	}
	public void setUserPost(Post userPost) {
		this.userPost = userPost;
	}
	
	
	

}
